package Strings;

import java.util.Scanner;

public class StringExercise16 
{
    public static void main(String[] args) {
        System.out.println("Enter the string:");   
        Scanner sc = new Scanner(System.in);  //scanner class object
        String str = sc.nextLine();
        System.out.println("uppercase of the string is:"+str.toUpperCase());   //converts to uppercase sentence
        sc.close();
    }
    
}
