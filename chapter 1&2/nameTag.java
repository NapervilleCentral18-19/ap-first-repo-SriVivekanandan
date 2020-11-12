import java.util.Scanner;
/**
 * This program will display your First and Middle on one line then your Lastname on the second line
 *
 * @Sri Vivekanandan
 * 
 */
public class nameTag
{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    String name = input.nextLine();
    String split_name[] = name.split(" ");
    System.out.println(split_name[0] + " " + split_name[1]);
    System.out.println(split_name[2]);


  }
    

    // Please enter your name: 
    // Sriram C. Vivekanandan
    // Sriram C.
    // Vivekanandan
    
    
    

}
