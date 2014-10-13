import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

/**
 * The building class creates a black, rectangular building with yellow windows
 * and grey streaks
 * 
 * @author (ikbiel) 
 * @version (2 October 2014)
 */
public class Building
{
    /** The x coordinate for the building's top left corner*/
    private int buildingX;
    /** The y coordinate for the building's top left corner*/
    private int buildingY;
    /** The width, or number of rows of the building*/
    private int numRows;
    /** The height, or number of floors of the building*/
    private int numFloors;

     /** Constructor for a car with a specified x and y coordinate, 
       * width and height
       * 
       * @param x   The starting x coordinate for the building
       * 
       * @param y   The starting y coordinate for the building
       * 
       * @param width   The width of the building
       * 
       * @param height  The height of the builidng
     */
    public Building(int x, int y, int width, int height)
    {
        // initialise instance variables
        this.buildingX = x;
        this.buildingY = y;
        this.numRows = width;
        this.numFloors = height;
    }
    
    /**
     * Draws each buiding in the graphics object as a black rectangle with 
     * yellow windowsand grey streaks
     * 
     * @param g2    The graphics object that draws the builing in the 
     * component
     */
    public void draw(Graphics2D g2)
    {
        // create the outline of the building
       Rectangle building = new Rectangle(buildingX, buildingY, numRows, numFloors);

       //draws the building foundation
       g2.setColor(Color.BLACK);
       g2.draw(building);
       g2.fill(building);
       
       //draws streaks across building to add 3d effects
       Point2D.Double start1 = 
        new Point2D.Double(buildingX+30, buildingY+225);
       Point2D.Double end1 = 
        new Point2D.Double(buildingX+80, buildingY+125);
       Line2D.Double streak1 = 
        new Line2D.Double(start1, end1);
        
       Point2D.Double start2 = 
        new Point2D.Double(buildingX+20, buildingY+175);
       Point2D.Double end2 = 
        new Point2D.Double(buildingX+70, buildingY+75);
       Line2D.Double streak2 = 
        new Line2D.Double(start2, end2);

       g2.setColor(Color.gray);
       g2.draw(streak1);
       g2.draw(streak2);
       
       //creates windows
       Rectangle window1 = new Rectangle(buildingX+25, buildingY+30, 10, 20);
       Rectangle window2 = new Rectangle(buildingX+60, buildingY+30, 10, 20);
       Rectangle window3 = new Rectangle(buildingX+15, buildingY+90, 10, 20);
       Rectangle window4 = new Rectangle(buildingX+40, buildingY+90, 10, 20);
       Rectangle window5 = new Rectangle(buildingX+65, buildingY+90, 10, 20);
       Rectangle window6 = new Rectangle(buildingX+60, buildingY+150, 10, 20);
       Rectangle window7 = new Rectangle(buildingX+60, buildingY+150, 10, 20);
       Rectangle window8 = new Rectangle(buildingX+40, buildingY+250, 10, 20);
       Rectangle window9 = new Rectangle(buildingX+70, buildingY+250, 10, 20);
       Rectangle window10 = new Rectangle(buildingX+20, buildingY+400, 10, 20);
       Rectangle window11 = new Rectangle(buildingX+50, buildingY+400, 10, 20);
       Rectangle window12 = new Rectangle(buildingX+80, buildingY+400, 10, 20);
       
       g2.setColor(Color.YELLOW);
       g2.draw(window1);
       g2.fill(window1);
       g2.draw(window2);
       g2.fill(window2);
       g2.draw(window3);
       g2.fill(window3);
       g2.draw(window4);
       g2.fill(window4);
       g2.draw(window5);
       g2.fill(window5);
       g2.draw(window6);
       g2.fill(window6);
       g2.draw(window7);
       g2.fill(window7);
       g2.draw(window8);
       g2.fill(window8);
       g2.draw(window9);
       g2.fill(window9);
       g2.draw(window10);
       g2.fill(window10);
       g2.draw(window11);
       g2.fill(window11);
       g2.draw(window12);
       g2.fill(window12);

       
    }

}
