package Strings;

import java.util.Scanner;

public class Stringfor 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //inputclass
        String s=sc.next(); //string input
        char[] ch=s.toCharArray(); //character storing in an array 
        for(int i=0;i<4;i++)
        {
            System.out.println(ch[i]);
            sc.close();
        }
        
    }
    
}
