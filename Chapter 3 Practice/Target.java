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
            (xValue + 40, yValue + 40, targetXDiam - 80, targetYDiam - 80);
        Ellipse2D.Double base4 = new Ellipse2D.Double
            (xValue + 60, yValue + 60, targetXDiam - 120, targetYDiam - 120);
        Ellipse2D.Double base5 = new Ellipse2D.Double
            (xValue + 80, yValue + 80, targetXDiam - 160, targetYDiam - 160);
        
        
        g2.setColor(Color.BLACK);
        g2.draw(targetBase);
        g2.fill(targetBase);
        g2.setColor(Color.WHITE);
        g2.draw(base2);
        g2.fill(base2);
        g2.setColor(Color.BLACK);
        g2.draw(base3);
        g2.fill(base3);
        g2.setColor(Color.WHITE);
        g2.draw(base4);
        g2.fill(base4);
        g2.setColor(Color.BLACK);
        g2.draw(base5);
        g2.fill(base5);
        
     
    }
}