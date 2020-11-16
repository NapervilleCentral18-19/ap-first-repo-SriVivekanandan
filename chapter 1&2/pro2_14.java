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
        // int first3max = 8;
        // int max4 = 8;
        // int max5 = 5;
        // int max6 = 3;
        // int max7 = 10;
        // int max8 = 10;
        // int max9 = 10;
        // int max10 = 10;
        
        // int num1 = rand.nextInt(first3max);
        // int num2 = rand.nextInt(first3max);
        // int num3 = rand.nextInt(first3max);
         
        // //System.out.print("Area Code: " + num1 + num2 + num3);
        
        // int num4 = rand.nextInt(max4);
        // int num5 = rand.nextInt(max5);
        // int num6 = rand.nextInt(max6);
        // int num7 = rand.nextInt(max7);
        // int num8 = rand.nextInt(max8);
        // int num9 = rand.nextInt(max9);
        // int num10 = rand.nextInt(max10);
        
        // System.out.println("(" + num1 + num2 + num3 + ") - " + num4 + num5 + num6 + " - " + num7 + num8 + num9 + num10);
        //////////////////////////
        
        ///when generating area code, second and thrid digits cannot be 8 or 9
        int area_code = 0;
        area_code = rand.nextInt(888);
        //System.out.println(area_code);
       
        ///when generating 2nd set, they cannot be greater than 742
        int middle_set = 0;
        middle_set = rand.nextInt(742) + 99; //cannot be greater than 742, +99 in order to have 3 digits 
        //System.out.println(middle_set);
        
        // 3rd set generator no rules, 4 numbers 
        int last_set = 0;
        last_set = rand.nextInt(9999);
        //System.out.println(last_set);
        
        //final print
        System.out.print("("+area_code+")" + " - " + middle_set + " - " + last_set);
        
        
        
        ///(434) - 548 - 3910
      
    }
}

