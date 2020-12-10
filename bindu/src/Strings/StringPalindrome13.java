package Strings;

import java.util.Scanner;

public class StringPalindrome13 
{
    public static void main(String[] args) {
         System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);     //scanner class object
        String str = sc.nextLine();      // String creation
        String s1 ="";               // empty string 
        for( int i = str.length()-1; i >= 0; i--)    // loop for checking  character
        {
            s1 =s1+str.charAt(i);
        }
        if(str.equals(s1))
        {
            System.out.println("Given string is pallindrome");    // prints if it is true
        }
        else
        {
            System.out.println(" Given string is not pallindrome");// prints if it is false
        }
        sc.close();   //scanner close
    }
}
