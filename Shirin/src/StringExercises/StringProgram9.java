package StringExercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class StringProgram9 
{
    public static void main(String[] args) 
    {
         //......... String anagaram .........//
         
        System.out.println("Enter the First name");
        Scanner sc = new Scanner(System.in);//scanner class
        String str1 = sc.nextLine();
        System.out.println("Enter the second name");
        String str2 = sc.nextLine();
        if(str1.length()==str2.length())// checking strings length
        {
            char[] word1 = str1.toUpperCase().toCharArray();// coverting string to character
            char[] word2 = str2.toUpperCase().toCharArray();
            Arrays.sort(word1);// sorting the string
            Arrays.sort(word2);
            boolean result = Arrays.equals(word1, word2);// checking strings are equal are not
            
            // control statement
            if (result)
            {
                System.out.println(str1 + " " +"and" +" " + str2 +" "+ "are anagarams");//true
            }
            else
            {
                System.out.println(str1 +" "+ "and" + str2 +" "+ "are not anagrams");//false

            }
        
        }
        else
        {
            System.out.println(str1 +" "+ "and" + str2 +" "+ "are not anagrams"); 
        }
        sc.close();// closing scanneer class
            
    }
    
}
