package Strings;

import java.util.Scanner;

public class UppercaseLowercase 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
       // char ch[];
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                sb.setCharAt(i,Character.toLowerCase(s.charAt(i)));
            }
            else if(Character.isUpperCase(s.charAt(i)))
            {
                sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
        }
        System.out.println("the given string "+sb);
        sc.close(); 
         // String s1=sc.nextLine();
        //s=s.toUpperCase();
       //System.out.println("the given string:"+s1);
       }
}
