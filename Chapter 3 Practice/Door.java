/**
* It's a door that has two sides.
* 
* @author (Samantha and Izzy) 
* @version (September 17, 2014)
*/
    
public class Door
{
    /** Name of the door */
    private String name;
    
    /** State of door: open or closed */
    public String state;
    
    /**
    * Default constructor for objects of class Door
    */
    public Door(String state,String name)
    {
        this.name = name;
        this.state = state;
    }
    
    public String getName()
    {
        return this.name; 
    }
    
    public String getState()
    {
        return this.state;
    }
    
    public void open()
    {
        this.state = "open";
    }
    
    public void close()
    {
        this.state= "close";
    }
    
    public void setName(String newName)
    {
        this.name= newName; 
    }
    public void setState(String newState)
    {
        this.state= newState;
    }
    
}