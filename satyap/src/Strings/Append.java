package Strings;
import java.util.*;
public class Append
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Scanner class for taking input from keyboard
        String str=sc.next(); //String var 
        StringBuffer sb=new StringBuffer(str); //StringBuffer class passing string var
        sb.append(" pachigolla");  // Appending the string
        System.out.println(sb);
        sb.insert(0,"hello "); //Inserting the value to the string
        System.out.println(sb);
        sb.replace(5,7," hi "); // replacing the values form string from giving the index values.
        System.out.println(sb);
        sb.delete(2,5); // Deleting the values in the string by using delete method
        System.out.println(sb);
        sb.setLength(10);
        System.out.println(sb);
        sb.reverse(); // reversing the string by using reverse method
        System.out.println(sb);
        sc.close(); // scanner close
    }
}
