package Stringmethods;
import java.util.*;
public class StringClass1 
{
     public static void main(String[] args) 
 {
    int vowels = 0, consonants = 0, digits = 0, spaces = 0,specialChar = 0;
    Scanner sc=new Scanner(System.in);//ScannerClass
    System.out.println("Enter string:");
    String str=sc.nextLine();
    // str.length() function to count number of character
    // character in given string.
    for (int i = 0; i < str.length(); i++) 
    { 
        char ch = str.charAt(i); 
          if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) 
            { 
              // To handle upper case letters 
                ch = Character.toLowerCase(ch); 
              //check the vowels 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                vowels++; 
            else
                consonants++; 
        } 
        else if (ch >= '0' && ch <= '9') //check digits
               digits++; 
        else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '&' || ch=='*')//check specialChar
              specialChar++;
        else
            spaces++; 
    } 
      
    System.out.println("Vowels: " + vowels); 
    System.out.println("Consonant: " + consonants); 
    System.out.println("Digit: " + digits); 
    System.out.println("Spaces: " + spaces); 
    System.out.println("specialChar: " + specialChar); 

 }       
        
}
