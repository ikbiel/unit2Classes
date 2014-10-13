import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * A rectangular, blue sky 
 * 
 * @author (ikbiel) 
 * @version (6 October 2014)
 */
public class Sky
{
    /**The x coordinate of the starting point of the sky */
    private int x;
    /**The y coordinate of the starting point of the sky */
    private int y;
    /**The width of the sky (horiztally) */
    private int width;
    /**The height of the sky (vertically) */
    private int height;

    /**
     * Creates a window with a starting x and y coordinate, width, and height.
     * 
     * @param topLeft   The starting top left corner of the rectangle
     * 
     * @param bottomLeft    The extending y coordinate of the rectangle
     * 
     * @param wWidth    The width of the rectangle
     * 
     * @param wHeight   The height of the rectangle
     */
    public Sky(int topLeft, int bottomLeft, int wWidth, int wHeight)
    {
        // initialise instance variables
        this.x = topLeft;
        this.y = bottomLeft;
        this.width = wWidth;
        this.height = wHeight;
    }
    
    /**
     * Draws a sky with a blue background 
     * 
     * @param g2    The graphics object that draws the aky in the 
     * component
     */
    public void draw(Graphics2D g2)
    {
        // create outline of window
        Rectangle sky = new Rectangle(x, y, width, height);
        
        //draws window
        g2.setColor(Color.blue);
        g2.draw(sky);
        g2.fill(sky);
        

    }

}
