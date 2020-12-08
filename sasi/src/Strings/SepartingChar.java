package Strings;

import java.util.Scanner;

public class SepartingChar 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);// scanner class
         String str = sc.nextLine();
         for(int i = 0; i < str.length(); i++) //loop for separating character
         {
            char c = str.charAt(i);// check the string 
            System.out.print(c + " ,"); // separating the character
         }
        sc.close();
    }
}
