package my.mavenproject1;

import java.io.*;
import java.util.*;

/**
 *
 * @author Ninjavin
 */

public class MakePayment {
    private ArrayList<CardDetails> details;
	public MakePayment() {
		details = new ArrayList<CardDetails>();
	}

	public void init(String filename) {
		try {        
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line = br.readLine();
			while((line=br.readLine()) != null) {
				String card_no = null, card_type = null, cvv = null, amt = null;
                int c  = 0;
                StringTokenizer st = new StringTokenizer(line,"|");
                while(st.hasMoreTokens()) {
                    switch (c) { 
                    	case 0:
                    		card_no = st.nextToken();
                    		c++;
                    		break;
                        case 1:
                            card_type = st.nextToken();
                            c++; 
                            break;
                        case 2:
                        	cvv = st.nextToken();
                        	c++;
                        	break;
                        case 3:	
                            amt = st.nextToken();
                            c = 0;
                            break;
                        default:
                            break;
                    }
                }
                CardDetails det = new CardDetails(card_no, card_type, cvv, amt);
                details.add(det);
			}
			br.close();
		}
		catch (FileNotFoundException e) {
            System.out.println("Error : File Not Found");
        }
		
        catch (IOException e) {
        	System.out.println("Error : IO Exception");              
        }
		
		System.out.println("Printing adopt : \n" + details);
	}
	
    public boolean setAccount(String filename, String card_no, String card_type, String cvv, String amt) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true));
            CardDetails det = new CardDetails(card_no, card_type, cvv, amt);
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
	
	public static void main(String args[]) {
        MakePayment mp = new MakePayment();
        LandingPageUI frame = new LandingPageUI(mp);
        frame.show();
        /*mgr.init("Database1.csv");
        mgr.setAccount("Database1.csv","475104","Lake Pally","54ytg91");
        //mgr.details.clear();*/
    }
}
