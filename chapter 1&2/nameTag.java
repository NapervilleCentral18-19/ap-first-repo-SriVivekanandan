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
    int spaces = name.indexOf(" " , name.indexOf(" ") +1); //find index of second space in string
    //System.out.println("Index: " + spaces);  in code test if unsure what spaces is being set as
    String first_middle = name.substring(0,spaces); //get first and middle name chunk
   
    String last = name.substring(spaces + 1); //last name chunk
    
    
    System.out.println(first_middle);
    System.out.println(last);
    
    //String split_name[] = name.split(" ");
    //System.out.println(split_name[0] + " " + split_name[1]);
    //System.out.println(split_name[2]);


  }
    

    //Please enter your name: 
    //Sriram C. Vivekanandan
    //Sriram C.
    //Vivekanandan
    
    
    

}
