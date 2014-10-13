import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;


/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //creating the sky
        Sky sky1 = new Sky(0, 0, 1600, 1600);
        
        sky1.draw(g2);
        //creating the buildings
        Building building1 = new Building(50, 500, 100, 600);
        Building building2 = new Building(175, 525, 100, 600);
        Building building3 = new Building(300, 475, 100, 600);
        Building building4 = new Building(425, 450, 100, 600);
        Building building5 = new Building(550, 500, 100, 600);
        Building building6 = new Building(675, 525, 100, 600);
        Building building7 = new Building(800, 475, 100, 600);
        Building building8 = new Building(925, 550, 100, 600);
        Building building9 = new Building(1050, 500, 100, 600);
        Building building10 = new Building(1175, 450, 100, 600);
        Building building11 = new Building(1300, 475, 100, 600);
        Building building12 = new Building(1475, 500, 100, 600);

        //draws buildings
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        building7.draw(g2);
        building8.draw(g2);
        building9.draw(g2);
        building10.draw(g2);
        building11.draw(g2);
        building12.draw(g2);
        
        
        //creating the moon
        Moon moon1 = new Moon(0, 0, 300);
        
        moon1.draw(g2);
        
        //creates the stars
        //create stars
        Stars star1 = new Stars(400, 400, "white");
        Stars star2 = new Stars(500, 300, "yellow");
        Stars star3 = new Stars(640, 200, "white");
        Stars star4 = new Stars(700, 375, "cyan");
        Stars star5 = new Stars(900, 265, "pink");
        Stars star6 = new Stars(1300, 450, "orange");
        Stars star7 = new Stars(1450, 340, "green");
        Stars star8 = new Stars(1500, 450, "yellow");
        Stars star9 = new Stars(1100, 300, "white");
        Stars star10 = new Stars(800, 475, "pink");
        Stars star11 = new Stars(400, 100, "yellow");
        Stars star12 = new Stars(500, 150, "cyan");
        Stars star13 = new Stars(700, 125, "green");
        
        star1.draw(g2);
        star2.draw(g2);
        star3.draw(g2);
        star4.draw(g2);
        star5.draw(g2);
        star6.draw(g2);
        star7.draw(g2);
        star8.draw(g2);
        star9.draw(g2);
        star10.draw(g2);
        star11.draw(g2);
        star12.draw(g2);
        star13.draw(g2);
        
        
        

        

        
        
    }

}
