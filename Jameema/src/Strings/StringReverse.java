package Strings;

import java.util.Scanner;

public class StringReverse 
{
    public static void main(String[] args)
    {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        StringBuffer sc1 = new StringBuffer("jemima"); //string buffer
         String str = sc.nextLine();
        sc1.append(str);
        sc1.reverse(); //reverse method
        System.out.println("reverse string is :" +sc1); //print the reverse string
        sc.close();
        
    }
    
}
