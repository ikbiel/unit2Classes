import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Draws two car shapes
 */
public class TargetComponent extends JComponent
{
    public void painComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target car1 = new Target(0, 0);
        
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        
        Target car2 = new Target(x, y);
        
        car1.draw(g2);
        car2.draw(g2);
    }
}