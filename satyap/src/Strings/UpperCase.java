package Strings;
import java.util.*;
public class UpperCase // class UpperCase for converting string to uppercase letter
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Scanner class
        String str=sc.nextLine(); //Taking String input from console
        System.out.println(str.toUpperCase());
        sc.close();
    }
    
}
