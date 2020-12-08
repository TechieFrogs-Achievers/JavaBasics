package Strings;

import java.util.Scanner;

public class SwapingStrings 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two strings");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1+s2;//adding two strings
        System.out.println(s1);
        s2 = s1.substring(0,s1.length()-s2.length()); 
        s1 = s1.substring(s2.length()); 
        System.out.println("swaping of two strings " +" string1 : " +s1 +"  " + " string2 : " +s2);
        sc.close();
        
    }
}
