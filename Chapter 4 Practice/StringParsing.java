import java.util.Scanner;

public class StringParsing
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        String userNum;
        
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        userNum = s.next();
        
        //Taking away the comma
        int comma = userNum.indexOf(",");
        
        String newNum = userNum.substring(0, comma);
        newNum += userNum.substring(comma+1);
        
        
        System.out.print("Your number without comma: " + newNum);
        
        //Adding the comma back into the number
        
        //int length = userNum.length();
        //int commaIndex =
        // UNFINISHED
        
        
    }
       
}
