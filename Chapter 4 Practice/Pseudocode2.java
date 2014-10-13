import java.util.Scanner;

public class Pseudocode2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double amountDue, amountReceived;
        
        System.out.print("How much does your customer owe you (in pennies): ");
        amountDue = s.nextDouble();
        
        System.out.print("How much did you receive from your customer (in pennies): ");
        amountReceived = s.nextDouble();
        
        double change = amountReceived - amountDue; 
        double dollars = (int)(change/100);
        
        double coins = change - (dollars*100);
        
        int quarters = (int)(coins/25);
        double remainder1 = coins - (quarters*25);
        
        int dimes = (int)(remainder1/10);
        double remainder2 = remainder1 - (dimes*10);
        
        int nickels = (int)(remainder2/5);
        double remainder3 = remainder2 - (nickels*5);
        
        int pennies = (int)(remainder3/1);
        
        System.out.print("You should give your customer: \n" + 
            "Dollars: " + dollars +"\n" + 
            "Quarters: " + quarters + "\n" +
            "Dimes: " + dimes +"\n" +
            "Nickels: " + nickels +"\n" +
            "Pennies: " + pennies);
  
    }

}
