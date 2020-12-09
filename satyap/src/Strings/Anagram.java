package Strings;
import java.util.*;
public class Anagram // Class StringNumeric for Anagram
{
    public static void main(String[] args) 
    {
        String str1 = "race"; // Taking string datatype for race and care.
       // String str1="racss" // Taking the diff length for str1 then outside else bock will excute.
       //String str1="racs"; // Taking the same length but diff value for anagram the inside else block will excute.
        String str2="Care";
        if(str1.length()==str2.length()) //cond for length
        {
            char[] ch=str1.toCharArray(); // converting string to char and placed in charArray()
            char[] ch1=str2.toCharArray();
            Arrays.sort(ch); // Sorting char in the array
            Arrays.sort(ch1);
            boolean result=Arrays.equals(ch,ch1); //equalling two strings of the arrays and stroing result
            if(result) //if result is same then print str1 and str2 are anagram or print not anagram
            {
                System.out.println(str1 +" and "+str2+" are anagram. ");
            }
            else{
                System.out.println(str1 +" and "+str2+" are anagram. ");
            }
        }
        else // if those two cond are false the print two strings are anagrams. 
        {
            System.out.println(str1+" and "+str2+" are an anagram. ");
        }
     
    } 
}

