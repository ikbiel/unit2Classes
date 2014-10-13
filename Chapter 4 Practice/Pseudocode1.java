import java.util.Scanner;

public class Pseudocode1

{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        String userNum;
        
        System.out.print("Please enter the ten digits of your phone number (just digits): ");
        userNum = s.next();
        
        String areaCode = userNum.substring(0,3);
        areaCode = "("+areaCode+")";
        
        String firstThree = userNum.substring(3,6);
        String lastFour = userNum.substring(6);
        
        String formattedNum = areaCode + " " + firstThree + "-" + lastFour;
        System.out.print("Your formatted phone number: " + formattedNum);
        
    }
}