package Strings;
import java.util.*;
public class CompareEquals // Class CompareEquals for equals to two strings.
{
    public static void main(String[] args)
    {
        System.out.println("Enter Strings:"); 
        Scanner sc=new Scanner(System.in); //scanner class
        String str1=sc.next();// Taking String input form console
        String str2=sc.next();
        String str3=sc.next();
        //System.out.println(str1.toLowerCase().equals(str2));
        System.out.println(str1.equals(str2)); // equalling two strings
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        
        sc.close(); // scanner class close
    }
}
