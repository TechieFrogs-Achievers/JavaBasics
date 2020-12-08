package Strings;

import java.util.Scanner;

public class VowelsandConsonents 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
       // char ch[];
        int count=0,count1=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
            {
                count++;
            }
            else if(s.charAt(i)<='a' || s.charAt(i)>='z')
            {
                count1++;
            }
        }
            System.out.println("vowles"+count); 
            System.out.println("consonents:"+count1);
            sc.close();
        }  
    }      
