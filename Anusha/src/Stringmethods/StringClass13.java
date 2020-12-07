package Stringmethods;
import java.util.*;
public class StringClass13 
{
   public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("enter a string");
        String str = scan.nextLine();                       //string value is taken by user
        StringBuffer sb = new StringBuffer(str);            //stringbuffer creating
        System.out.println("The users string is " +sb);
        sb.setLength(0);                                    //clear the data in string  using setLength() method
        System.out.println("The string is " +sb);
        scan.close(); 
   } 
}
