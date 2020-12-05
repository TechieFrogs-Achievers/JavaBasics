package StringExercises;

import java.util.Scanner;

public class StringProgram15 
{
    public static void main(String[] args) 
    {
        // ...... capitalize.......//

         System.out.println("Enter the String :");
         Scanner sc = new Scanner(System.in);//scanner class
         String str = sc.nextLine();//
         String word[] = str.split(" ");// it takes uppercase of every starting string
         String w1 ="";// storing  string
         for ( int i = 0; i < word.length; i++)
         {
             w1 =  w1 + Character.toUpperCase(word[i].charAt(0)) + word[i].substring(1)+ " "; 
         }
         System.out.println(w1);// printing
         sc.close();
        
    }
    
}
