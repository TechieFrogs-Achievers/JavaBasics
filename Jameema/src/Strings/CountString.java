package Strings;

import java.util.Scanner;

public class CountString 
{
    
    Scanner sc = new Scanner(System.in); //scanner class
    String s = sc.nextLine();
    String s1 = sc.nextLine(); //input 
    
    //count of characters without space
    public void CharCount()
    {   
        int count=0;
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ') //remove the space
            {
                count++;
            }
            
        }
        System.out.println("the count of string : "+count);
        
    }
    //count of two strings characters
    public void ConcatCount()
    {
        int count=0;
        String sl = s+s1; //concatining string
        for(int i=0;i<sl.length();i++)
        {
            if(sl.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println("concatination of two strings  :"+sl);
        System.out.println("the count of two strings:  "+count); //prints the count of two strings
    }
    //count of punctuations in string
    public void punchCount()
    
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='?' || s.charAt(i)=='!' || s.charAt(i)=='.' || s.charAt(i)==',' || s.charAt(i)==';' || s.charAt(i)=='@' || s.charAt(i)=='*')
            {
                count++;
            }
        }
        System.out.println("the count of punctuation:  "+count); //print the punctutations in string
    }
    //count of vowels and consonants in string
    public void vowelCount()
    {
        int count=0;
        int vowCount=0;
        s=s.toLowerCase();
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                vowCount++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                count++;

            }
        }
        System.out.println("the count of consonants:  "+count); //print the count of consonants
        System.out.println("the count of  vowels:  "+vowCount); //print the count of vowels

    }
    
    public static void main(String[] args) 
    {
        System.out.println("enter string");
        CountString sobj = new CountString();
        sobj.CharCount();
        sobj.ConcatCount();
        sobj.punchCount();
        sobj.vowelCount();
        
        
    }
    
}
