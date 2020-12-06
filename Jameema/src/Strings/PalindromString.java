package Strings;

import java.util.Scanner;

public class PalindromString
 {
     public static void main(String[] args) 
     {
         System.out.println("enter string:");
         Scanner sc = new Scanner(System.in); //scanner class
         String str = sc.nextLine(); //input 
         String temp = ""; //empty variable
         for(int i=str.length()-1;i>=0;i--)
         {
             temp = temp+str.charAt(i); //assinging character to temp variable
         }
         if(str.equals(temp))
         {
             System.out.println("the given string palindrome "); //if true
         }
         else
         {
             System.out.println("the given string is not palindrome"); //if false
         }
         sc.close();
     }
    
}
