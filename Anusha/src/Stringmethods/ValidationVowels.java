package Stringmethods;
import java.util.*;
public class ValidationVowels 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);//create scanner object
        System.out.println("Please enter a vowel, lowercase!");
        //check vowels
        while (!sc.hasNext("[aeiou]")) 
        {
          System.err.println("Error:That's not a vowel!");
          sc.next();
        }
        String vowel = sc.next();//moves to the next character
        System.out.println("Thank you! Got : vowel= " + vowel); 
    }
}
