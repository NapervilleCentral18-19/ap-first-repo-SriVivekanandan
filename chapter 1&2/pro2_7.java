import java.util.Scanner;
/**
 * Project 2_7 will take a number of seconds and convert them to hours, minutes, and seconds
 *
 * @Sri Vivekanandan
 * 9-21-2020
 */
public class pro2_7
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int seconds = 0;
        int hours = 0;
        int seconds2 = 0;
        int minutes = 0;
        
        
        System.out.println("Please enter the seconds you wish to convert: ");
        seconds = input.nextInt();
        
        hours = (seconds / 60)/60; //calculate hours
        seconds2 = seconds % 60; //calulate seconds left over
        minutes = (seconds/60) % 60;
        
        
        
        System.out.println("Hours: " + hours + "  Minutes: " + minutes + "  Seconds: " + seconds2);
       
        
        
        
        
        
        
        
        
        
        
        
       
        
        
    }

    
}
