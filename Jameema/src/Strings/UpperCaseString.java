package Strings;

import java.util.Scanner;

public class UpperCaseString 
{
    public static void main(String[] args) 
    {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in); //scanner class
        String str = sc.nextLine(); //input string
        System.out.println("the upper case of String  :" +str.toUpperCase()); // printimng uppercase words
        System.out.println("the lower case of string :" +str.toLowerCase()); //printing all lowercase words
        sc.close(); 
        
    }
    
}
