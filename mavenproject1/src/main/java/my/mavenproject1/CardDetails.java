package my.mavenproject1;
/**
 *
 * @author Ninjavin
 */
public class CardDetails 
{
    private String card_no, card_type, cvv, amt;
            
    public String getCardNum() {
        return this.card_no;
    }
    
    public String getCardType() {
        return this.card_type;
    }
    
    public String getCvv() {
    	return this.cvv;
    }
    
    public String getAmount() {
        return this.amt;
    }

    public CardDetails(String card_no, String card_type, String cvv, String amt)
    {
        this.card_no = card_no;
        this.card_type = card_type;
        this.cvv = cvv;
        this.amt = amt;
    }
    
    @Override
    public String toString()
    {
        return "\n" + card_no + "|" + card_type + "|" + cvv + "|" + amt;        
    }
}
