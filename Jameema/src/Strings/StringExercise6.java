package Strings;

import java.util.Scanner;

public class StringExercise6 
{
    public static void main(String[] args) 
    {
        System.out.println("enter string one:");
        Scanner sc = new Scanner(System.in); //Scanner method
        String s1 = sc.nextLine(); //assign variables
        System.out.println("enter string two:");
        String s2 = sc.nextLine();
        System.out.println("the comparision of two strings:" +(s1.equals(s2))); //it prints false if both strings are not equal
        System.out.println("the comparision of two stringss:" +(s1.equalsIgnoreCase(s2))); //it prints true if both strings are equal
        sc.close();
        
    }
    
}
