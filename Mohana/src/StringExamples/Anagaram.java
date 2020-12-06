package StringExamples;

import java.util.Arrays;

public class Anagaram
{
    public static void main(String[] args) 
    {
        String s1="acbd";
        String s2="bcad";
     if(s1.length()!=s2.length())//condition to check lengths 
    {
    System.out.println("strings are not anagrams");
    }
    //converting into char array
    char i[]=s1.toCharArray();
    char j[]=s2.toCharArray();
    //sorting method
    Arrays.sort(i);
    Arrays.sort(j);
   if(Arrays.equals(i,j))//to check letters are same or not
   {
    System.out.println("strings are anagrams");
   }
   else
   {
   System.out.println("strings are ot anagrams");
   }
        
    }
    
}
