
/**
 * A vending machine that holds cans of soda
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class VendingMachine
{
    /** Cans: number of cans in vending machine */
    private int canCount;
    /** Tokens: number of tokens in vending machine */
    private int tokenCount;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        // initialise instance variables
           this.canCount = 0;
           this.tokenCount = 0;
    }
    
    public void fillUp(int cansAdd)
    {
        this.canCount = this.canCount+ cansAdd;
    }
    
    public void insertToken()
    {
        // Instructions for updating the token and can counts
        this.tokenCount = this.tokenCount + 1;
        this.canCount = this.canCount - 1;
    }
    
    public int getCanCount()
    {
        return this.canCount;
    }
    
    public int getTokenCount()
    {
        return this.tokenCount;
    }

   

}
