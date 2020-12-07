package StringExercises2;

import java.util.Scanner;

public class StringSeparatechar 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the String");
        Scanner sc = new Scanner(System.in);// scanner class
         String str = sc.nextLine();
         for(int i = 0; i < str.length(); i++) //using for loop
         {
            char c = str.charAt(i);// check the string 
            System.out.print(c + " ,"); // separating the character
         }
        sc.close();

    }
    
}
