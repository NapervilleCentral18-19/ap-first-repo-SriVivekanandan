import java.util.Scanner;
import java.util.Random;
/**
 * This program will print a random phone number
 *
 * Sri Vivekanandan(your name)
 * @ (a version number or a date)
 */
public class pro2_14
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int first3max = 8;
        int max4 = 8;
        int max5 = 5;
        int max6 = 3;
        int max7 = 10;
        int max8 = 10;
        int max9 = 10;
        int max10 = 10;
        
        int num1 = rand.nextInt(first3max);
        int num2 = rand.nextInt(first3max);
        int num3 = rand.nextInt(first3max);
        
        

        //System.out.print("Area Code: " + num1 + num2 + num3);
        
        int num4 = rand.nextInt(max4);
        int num5 = rand.nextInt(max5);
        int num6 = rand.nextInt(max6);
        int num7 = rand.nextInt(max7);
        int num8 = rand.nextInt(max8);
        int num9 = rand.nextInt(max9);
        int num10 = rand.nextInt(max10);
        
        System.out.println("(" + num1 + num2 + num3 + ") - " + num4 + num5 + num6 + " - " + num7 + num8 + num9 + num10);
        
        
        
        
        
        
        
    }
}