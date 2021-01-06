package Strings;

import java.util.Arrays;

public class Anagrams 
{
    public static void main(String[] args)
    {
        String s1="face";
        String s2="Care";
     if(s1.length()!=s2.length())//checking the two string lengths
    {
    System.out.println("strings are not anagrams");
    }
    char x[]=s1.toCharArray();//coversion of string to char array
    char y[]=s2.toCharArray();//coversion of string to char array
    Arrays.sort(x);//sorting method
    Arrays.sort(y);//sorting method
   if(Arrays.equals(x,y))
   {
    System.out.println("strings are anagrams");
   }
   else
   {
   System.out.println("strings are ot anagrams");
   }

    }

}
