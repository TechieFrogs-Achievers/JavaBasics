package Strings;

import java.util.Scanner;

public class StringExercise1
 {
     public static void main(String[] args) 
     {
         System.out.println("enter the string");
         Scanner sc = new Scanner(System.in); //scanner method
         String s = sc.nextLine(); 
         System.out.println("the length of String is  :" +s.length()); //prints the string length
         sc.close(); //close the sacnner object
         
     }
    
}
