package Strings;

import java.util.Scanner;

public class punchuations
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
       // s=s.toLowerCase();
       // char ch[];
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='?' || s.charAt(i)=='!' || s.charAt(i)==',' ||s.charAt(i)==':' ||s.charAt(i)=='.')
            {
                count++;
            }
        }
            System.out.println("the number of punchuvations is:"+count);
            sc.close();
    }
}
