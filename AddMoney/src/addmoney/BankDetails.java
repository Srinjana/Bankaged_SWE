
package addmoney;

/**
 *
 * @author swast
 */
public class BankDetails 
{
    private String acc_no, branch_name, amt;
            
    public String getacc_no()
    {
        return this.acc_no;
    }
    public String getbranch_name()
    {
        return this.branch_name;
    }
    public String getamt()
    {
        return this.amt;
    }
    public BankDetails(String acc_no,String branch_name,String amt)
    {
        this.acc_no=acc_no;
        this.branch_name=branch_name;
        this.amt= amt;
    }
    @Override
    public String toString()
    {
        return "\n"+acc_no+ "|" + branch_name + "|" + amt;        
    }
}
