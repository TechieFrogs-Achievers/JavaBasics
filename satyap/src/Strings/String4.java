package Strings;
import java.util.*;


public class String4
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       int vowelcount=0,consonantCount=0;
       str=str.toLowerCase();
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
           {
               vowelcount++;
           } 
           else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
           {
               consonantCount++;
           }
           else{
               System.out.println("Invalid Character");
           }
        }
        System.out.println("Vowels"+vowelcount);
        System.out.println("Consonants:"+consonantCount);
        sc.close();
    }
}
