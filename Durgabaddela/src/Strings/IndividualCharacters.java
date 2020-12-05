package Strings;

import java.util.Scanner;

public class IndividualCharacters
{
   public static void main(String[] args)
   {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");  
    String s =sc.nextLine();  
    for(int i = 0; i < s.length(); i++)
    {  
        System.out.print(s.charAt(i) + "  ");//print the indidual characters   
    }  
   } 
}
