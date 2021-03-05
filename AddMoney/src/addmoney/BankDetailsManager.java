/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addmoney;


import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Saha
 */
public class BankDetailsManager {
    private ArrayList<BankDetails> details;
	public BankDetailsManager()
	{
            details = new ArrayList<BankDetails>();
	}
	
	//getdetails()
	public void init(String filename)
	{
		try
		{
                    
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line = br.readLine();
			while((line=br.readLine())!=null)
                        {
                            String acc_no = null,branch_name = null,amt = null;
                            int c  = 0;
                            StringTokenizer st = new StringTokenizer(line,"|");
                            while(st.hasMoreTokens())
                            {
                                switch (c) 
                                { 
                                    	case 0:
                                    		acc_no=st.nextToken();
                                             c++;
                                                break;
                                        case 1:
                                                branch_name=st.nextToken();
                                                c++; 
                                                break;
                                        case 2:	
                                                amt=st.nextToken();
                                                c=0;
                                                break;
                                        default:
                                                break;
                                    }
                            }
                            BankDetails det = new BankDetails(acc_no,branch_name,amt);
                            details.add(det);
			}
			br.close();
		}
		catch (FileNotFoundException e) 
                {
                    System.out.println("Error : File Not Found");
                } 
                catch (IOException e) 
                {
                        System.out.println("Error : IO Exception");              
                }
		System.out.println("Printing adopt : \n"+details);
		}
        public boolean setAccount(String filename,String acc_no,String branch_name,String amt)
        {
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true));
            BankDetails det = new BankDetails(acc_no,branch_name,amt);
            details.add(det);
            String str = det.toString();
            System.out.println(str);
            bw.write(str);
            bw.close();
        }
        catch(IOException e){
            System.out.println("Error : IO Exception");
        }
        return true;
    }
	
	public static void main(String args[])
        {
            BankDetailsManager mgr= new BankDetailsManager();
            NewJFrame frame=new NewJFrame(mgr);
            frame.show();
            /*mgr.init("Database1.csv");
            mgr.setAccount("Database1.csv","475104","Lake Pally","54ytg91");
            //mgr.details.clear();*/
        }
}
