import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Write a description of class lab2_9 here.
 * This program will calculate the surface area and volume 
 *  of a sphere
 * @author Sri Vivekanandan
 * @version 9-15-2020
 */
public class lab2_9
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println("This program will calculate the volume and the surface area of a sphere /n");
        
        
        double radius = 0;
        double volume = 0;
        double sa = 0;
        
        System.out.println("Please enter the radius: ");
        radius = input.nextDouble();
        //pi = Math.PI ... is a constant
        
        volume = (1.3333 * Math.PI * (Math.pow(radius,3)));
        sa = (4 * Math.PI * (Math.pow(radius,2)));
        
        
        System.out.println("The volume of the sphere is: " + df.format(volume));
        System.out.println("The surface area of the sphere is: " + df.format(sa));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}



///This program will calculate the volume and the surface area of a sphere 
//Please enter the radius: 
//12
//The volume of the sphere is: 7238.0485
//The surface area of the sphere is: 1809.5574