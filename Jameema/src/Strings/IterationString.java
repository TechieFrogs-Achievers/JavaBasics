package Strings;

import java.util.Scanner;

public class IterationString 
{
    public static void main(String[] args) 
    {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1= sc.nextLine();
        //forloop
        for(int i=0;i<str.length();i++)
        {
            char StringChar =str.charAt(i);
            System.out.print(StringChar + " ");
           
        }
        
        System.out.println();

        //foreach loop
        for(char StrChar : str1.toCharArray())
        {
            System.out.print( StrChar + " ") ;
        }
        sc.close();

    }
    
}
