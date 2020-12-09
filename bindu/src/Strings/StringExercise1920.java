package Strings;

import java.util.Scanner;

public class StringExercise1920 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string:");   
        Scanner sc = new Scanner(System.in); //scanner class object
        String str = sc.nextLine();
        String str1 = sc.nextLine();    // string input methods
        System.out.println("The Index of string is:"+str.indexOf('s'));   //checks the char in the string
        System.out.println("combination of strings:"+str.contains(str1));  //prints the boolean value
        System.out.println("The index of str1 is:"+str.indexOf(str1));    //prints the index val of string1 in string
        sc.close();    //scanner close
        
    }
    
}
