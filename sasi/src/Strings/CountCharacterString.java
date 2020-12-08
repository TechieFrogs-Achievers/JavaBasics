package Strings;

import java.util.Scanner;

public class CountCharacterString 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=' ')
            {
              count++;
            }
        }
       // System.out.println("first string:"+count);
        System.out.println("second string:"+count);
        sc.close();
    }
}
