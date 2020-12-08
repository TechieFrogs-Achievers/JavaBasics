package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram
 {
    public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in); //input class 
         String s=sc.nextLine(); 
         String s1=sc.nextLine();
         if(s.length()==s1.length())
         {
             char[] ch=s.toCharArray(); //string converting to char array
             char[] ch1=s1.toCharArray();
             Arrays.sort(ch); // arrays sorting 
             Arrays.sort(ch1);
             boolean result=Arrays.equals(ch ,ch1); //two strings equaltes to check the char are same or not
             if(result)
             {
                 System.out.println(s+"and"+s1 +"    "+"Are Anagram");
             }
             else 
             {
                 System.out.println("Not an Anagram");
             }
         }
             else 
             {
                 System.out.println("not an anagram not same length");
             }
            sc.close();
    }
}
