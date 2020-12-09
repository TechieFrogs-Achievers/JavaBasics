package StringExercises;

import java.util.Scanner;

public class StringProgram18 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the String");
        Scanner sc = new Scanner(System.in);// scanner class
         String str = sc.nextLine();
         for(char c:str.toCharArray()) // using for eachloop
         {
           
            System.out.print(c + " ,"); // separating the character
         }
        sc.close();
        
    }
    
}
