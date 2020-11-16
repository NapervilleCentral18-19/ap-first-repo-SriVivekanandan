import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * This program will determine the value of coins in a jar and 
 * print the total in dollars and cents
 *
 * @Sri Vivekanandan
 * @9-22-2020
 */
public class doc2_12
{
    public static void main(String[]  args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");
        double total = 0.0;
        double quarters = 0.0;
        double dimes = 0.0;
        double nickels = 0.0;
        double pennies = 0.0;
        
        System.out.print("Please enter the quarters, dimes, nickels, and pennies: ");
        quarters = input.nextDouble();
        dimes = input.nextDouble();
        nickels = input.nextDouble();
        pennies = input.nextDouble();
        
        quarters = quarters * .25;
        dimes = dimes * .10;
        nickels = nickels * .05;
        pennies = pennies * .01;
        
        total = quarters + dimes + nickels + pennies;
        
        System.out.println("$" + df.format(total));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
   
    
}
