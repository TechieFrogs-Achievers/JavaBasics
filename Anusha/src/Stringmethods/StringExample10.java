package Stringmethods;
import java.util.*;
public class StringExample10 
{
   public static void main(String[] args) 
   {
    Scanner scan = new Scanner(System.in);              //scanner class for taking input through keyboard
    System.out.println("enter string:");
    String str = scan.nextLine();                       //string creation
    
    str = str.replaceAll("\\s", "");                    //removing all white spaces
    System.out.println("The string is :" +str);
    scan.close();
   } 
}
