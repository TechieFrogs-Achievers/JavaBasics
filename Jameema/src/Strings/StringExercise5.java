package Strings;

import java.util.Scanner;

public class StringExercise5 
{
    public static void main(String[] args) 
    {
        System.out.println("enter first string :");
        Scanner sc = new Scanner(System.in); //scanner method
        String s1 = sc.nextLine();
        System.out.println("enter second string :");
        String s2 = sc.nextLine(); //assigning values by using scanner object
        String s3 = "jemima";
        String s4 = "jemima";  //datamembers
        String s5 = new String("Bndaru");
        System.out.println("the comparision btw two strings  :" +(s1==s2)); //comparing two strings by reference--false
        System.out.println("the comparision btw two strings  :" +(s3==s4)); //comparing two strings --true
        System.out.println("the comparision btw two strings  :" +(s1==s4)); //false
        System.out.println("the comparision btw two strings  :" +(s3==s5)); //false
        sc.close();
    }
    
}
