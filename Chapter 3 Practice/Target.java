import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/** Creating the target
 */

public class Target
{
    private int targetXDiam;
    private int targetYDiam;
    private int xValue;
    private int yValue;
    
    
    public Target(int xPosition, int yPosition, int diamX, int diamY)
    {
       xValue = xPosition;
       yValue = yPosition; 
       targetXDiam = diamX;
       targetYDiam = diamY;
    }
    
    /** Draws the target
     */
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double targetBase = new Ellipse2D.Double(100, 100, 300, 300);
        Ellipse2D.Double base2 = new Ellipse2D.Double
            (xValue + 20, yValue + 20, targetXDiam - 40, targetYDiam - 40);
        Ellipse2D.Double base3 = new Ellipse2D.Double
            (xValue + 20, yValue + 20, targetXDiam - 40, targetYDiam - 40);
        Ellipse2D.Double base4 = new Ellipse2D.Double
            (xValue + 20, yValue + 20, targetXDiam - 40, targetYDiam - 40);
        Ellipse2D.Double base5 = new Ellipse2D.Double
            (xValue + 20, yValue + 20, targetXDiam - 40, targetYDiam - 40);
        
        
        g2.setColor(Color.BLACK);
        g2.draw(targetBase);
        g2.setColor(Color.WHITE);
        g2.draw(base2);
        g2.setColor(Color.BLACK);
        g2.draw(base3);
        g2.setColor(Color.WHITE);
        g2.draw(base4);
        g2.setColor(Color.BLACK);
        g2.draw(base5);
        
     
    }
}