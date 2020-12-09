package Strings;
import java.util.*;
public class SwappingStrings  // class for swapping the strings
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class
        String str1=sc.next(); // string notation
        String str2=sc.next();
        str1=str1+str2; // adding two strings
        str2=str1.substring(0,(str1.length()-str2.length())); //swapping two strings
        str1=str1.substring(str2.length());
        System.out.println("String after swapping:"+str1+" "+str2);
        sc.close(); //scanner close
    } 
}
