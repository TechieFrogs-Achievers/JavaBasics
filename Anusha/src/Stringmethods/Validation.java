package Stringmethods;
import java.util.*;

import org.graalvm.compiler.lir.stackslotalloc.StackSlotAllocatorUtil;
public class Validation 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);//create scanner object
        System.out.println("Please enter a consonant, lowercase!");
        //check vowels
        while (sc.hasNext("[aeiou]")) 
        {
          System.err.println("Error:That's not a consonant!");
           sc.next();
        }
        String consonant = sc.next();//moves to the next character
        System.out.println("Thank you! Got : " + consonant); 
     
        //check digit
        System.out.println("Enter digit:");
          while(!sc.hasNext("[1234567890]"))
        {
           System.err.println("error: this is not a digit: try again");
           sc.next();
        }
        int digit=sc.nextInt();
        System.out.println("you got it! digit="+digit);

        //check Special characters
        System.out.println("Enter Special Character:");
        while(!sc.hasNext("[@#$&]"))
        {
           System.err.println("error: this is not a Special character: try again");
           sc.next();
        }
        String character=sc.next();
        System.out.println("you got it! Special character="+character);
        
    }
}
