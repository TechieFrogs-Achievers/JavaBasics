package Strings;

import java.util.Scanner;

//import sun.security.util.Length;

public class Countcharacter
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
              count++;
            }
        }
        System.out.println("number of charcters in a given string:"+count);
        sc.close();
    }
 }
