import java.util.Scanner;

public class Annuity
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double pmt, i, n;
        
        System.out.print ("Enter your periodic payment: ");
        pmt = s.nextDouble();
        
        System.out.print ("Enter you periodic interest: ");
        i = s.nextDouble();
        
        System.out.print ("Enter the number of payments you have to make: ");
        n = s.nextDouble();
        
        double x = Math.pow(1+i, n - 1);
        double annuity = pmt*(((x)-1)/i)/((x))+1;  
        annuity = Math.round(annuity);
        System.out.println(annuity);
    }
}
    

