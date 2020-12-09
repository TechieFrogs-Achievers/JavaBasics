package Strings;

import java.util.Scanner;

public class StringExercise2 
{
    public static void main(String[] args)
     {
         System.out.println("enter string1:");
         Scanner sc = new Scanner(System.in); //scanner method
         String s =sc.nextLine();
         System.out.println("enter second string:");
         String s1 = sc.nextLine(); //assignthe value using scanner object
         System.out.println("the comparision of two strings are:" +s.compareTo(s1)); //comparision of two  strings
        sc.close();
    }
    
}
