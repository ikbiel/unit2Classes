import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Color;

/**
 * The moon class creates a white circle as the moon
 * 
 * @author (ikbiel) 
 * @version (2 October 2014)
 */
public class Moon
{
    /** The center x coordinate of the circle */
    private int x;
    /** The center y coordinate of the circle */
    private int y;
    /** The horizontal and vertical diameter of the circle */
    private int width;
    /** The vertical diameter of the ellipse (height) */
    private int height;

    /**
     * Constructor for a moon with a specified center x and y coordinate, width, and height.
     * 
     * @param centerX   The center starting x coordinate for the moon
     * 
     * @param centeryY  The center starting y coordinate for the moon
     * 
     * @param mDiam The diameter of the moon, length horizontally and vertically
     */
    public Moon(int centerX, int centerY, int mDiam)
    {
        this.x = centerX;
        this.y = centerY;
        this.width = mDiam;
        this.height = mDiam;
    }
    
    /** Draws the moon as a white circle with the graphics object
     * 
     * @param g2    The graphics object that draws the moon in the 
     * component
     */
    public void draw(Graphics2D g2)
    {
       Ellipse2D.Double moon = new Ellipse2D.Double(x, y, width, height);
       
       g2.setColor(Color.white);
       g2.draw(moon);
       g2.fill(moon);
    }

}
