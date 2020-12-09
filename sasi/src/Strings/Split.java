package Strings;

import java.util.Scanner;

public class Split 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String string[]=s.split(" "); 
        for (int i = 0; i<string.length; i++)
        {
        System.out.println(string[i]);
        }
        sc.close();
        
    }
    
}
