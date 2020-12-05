package Strings;

import java.util.Arrays;

public class NinethExample {
    public static void main(String[] td){
        String s1="listen";
        String s2="silent";
     if(s1.length()!=s2.length())
    {
    System.out.println("strings are not anagrams");
    }
    char a[]=s1.toCharArray();
    char b[]=s2.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
   if(Arrays.equals(a,b))
   {
    System.out.println("strings are anagrams");
   }
   else
   {
   System.out.println("strings are ot anagrams");
   }

    }
    
}
