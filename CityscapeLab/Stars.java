import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

/**
 * The Stars class creates a star for the cityscape sky
 * 
 * @author (ikbiel) 
 * @version (7 October 2014)
 */
public class Stars
{
    /**The x starting coordinate of the star */
    private int x;
    /**The y starting coordinate of the star */
    private int y;
    /**The specified color of the star */
    private String chooseColor;

    /**
     * Creates a star with a specified, starting x and y coordinate and a specified color
     * 
     * @param startX    The starting x coordinate of the star
     * 
     * @param startY    The starting y coordinate of the star
     * 
     * @param pickColor The color of the star that will determine the color object for the graphics
     * object
     */
    public Stars(int startX, int startY, String pickColor)
    {
        this.x = startX;
        this.y = startY;
        this.chooseColor = pickColor;
    }

    /**
     * Draws a star in the graphics object
     * 
     * @param g2    The graphics object where the star is drawn
     */
    public void draw(Graphics2D g2)
    {
       //creates star
       Ellipse2D.Double star = 
        new Ellipse2D.Double(x, y, 5, 5);
        
       //draws star and chooses color
       if (this.chooseColor == "white")
       {
           g2.setColor(Color.white);
        }
       if (chooseColor == "yellow")
       {
           g2.setColor(Color.yellow);
        }
       if (chooseColor == "cyan")
       {
           g2.setColor(Color.cyan);
        }
       if (chooseColor == "pink")
       {
           g2.setColor(Color.pink);
        }    
       if (chooseColor == "orange")
       {
           g2.setColor(Color.orange);
        }
       if (chooseColor == "green")
       {
           g2.setColor(Color.green);
        } 

       g2.draw(star);
       g2.fill(star);
    }
}
