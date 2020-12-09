package Strings;

import java.util.Scanner;

public class LongestSequence 
{
    public static String lcp(String s, String t) //parameterised method
    {  
        int n = Math.min(s.length(),t.length());  
        for(int i = 0; i < n; i++)
        {  
            if(s.charAt(i)!= t.charAt(i)) //condition
            {  
                return s.substring(0,i);  
            }  
        }  
        return s.substring(0,n);  
    }  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  //scanner class
        String str = sc.nextLine();  //imput
        String str1="";  
        int n = str.length();  
        for(int i = 0; i < n; i++)
        {  
            for(int j = i+1; j < n; j++)
            {  
                String x = lcp(str.substring(i,n),str.substring(j,n));  
                if(x.length() > str1.length()) //condition
                str1=x;  
            }  
        }  
        System.out.println("Longest repeating sequence: "+str1); //print the sequence
        sc.close();
        
    }
    
}
