

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A vending machine that holds cans of soda in exchange for tokens. 
 * 
 * @author (ikbiel) 
 * @version (19 September 2014)
 */
public class VendingMachineTest
{
    /** Cans: number of cans in vending machine */
    

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {

    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    
    @Test
    public void testFillUp()
    {
        VendingMachine testVM = new VendingMachine();
        int cans = testVM.getCanCount();
        assertEquals(0, cans);
        
    }
    
    @Test public void testInsertToken()
    {
        VendingMachine testVM = new VendingMachine();
        int cans = testVM.getCanCount();
        int tokens = testVM.getTokenCount();
        assertEquals(0, tokens);
       
    }
    
    
}
