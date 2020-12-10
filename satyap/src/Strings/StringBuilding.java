package Strings;
import java.util.*;
public class StringBuilding
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); // Scanner class
        String str=sc.next(); // Taking input from console
        StringBuilder sb=new StringBuilder(str); // StringBuilder class
        System.out.println(sb.append(" Hello ")); // Appending string  using StringBuilder class
        System.out.println(sb.insert(0,"HI ")); //inserting string using StringBuilder class
        System.out.println(sb.delete(1,3)); // Deleting string using StringBuilder class
        System.out.println(sb.reverse()); // Reversing string using StringBuilder class
        sc.close(); // Scanner class
    }
}
