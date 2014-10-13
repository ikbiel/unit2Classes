import java.util.Scanner; 

public class RectangleInfo
{

   public static void main (String[] args)
    {
       Scanner s = new Scanner(System.in);
       double length, width;
       
       System.out.print("Enter the rectangle's length: ");
       length = s.nextDouble();
       
       System.out.print("Enter the rectangle's width: ");
       width = s.nextDouble();
       
       double area;
       area = length*width;
       
       double diagonal;
       diagonal = (length * length)+(width * width);
       diagonal = Math.sqrt(diagonal);
       diagonal = Math.round(diagonal);
       
       System.out.print("Area of your rectangle: " + area);
       System.out.println("");
       System.out.print("Length of diagonal: " + diagonal);
    }

}
