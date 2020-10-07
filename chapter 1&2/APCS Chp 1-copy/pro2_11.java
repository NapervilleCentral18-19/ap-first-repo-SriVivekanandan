import java.util.Scanner;
/**
 * Write a description of class pro2_11 here.
 * 
 * @author Sri Vivekanandan
 * @version 9-15-20
 */
public class pro2_11
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double miles = 0;
        double gallons = 0;
        double odometerOne = 0;
        double odometerTwo = 0;
        double mpg = 0;
        
        System.out.println("Please enter the beginning odometer reading: ");
        odometerOne = input.nextDouble();
        
        System.out.println("Please enter the ending odometer reading: ");
        odometerTwo = input.nextDouble();
        
        miles = odometerTwo - odometerOne; //calculate miles driven
        
        System.out.println("Miles Traveled: " + miles);
        
        System.out.println("Please enter the total gas used: ");
        gallons = input.nextDouble();
        
        mpg = miles / gallons;
        
        System.out.println("The mpg for the trip was " + mpg);
        
        
        
        
        
        
        
        
    }
        
}
