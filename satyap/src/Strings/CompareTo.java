package Strings;

import java.util.Scanner;

public class CompareTo 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        String str2=sc.next();
        //String str="satya";
        //String str1="satya";
        //String str2="sasi";
        System.out.println(str.compareTo(str1));
        System.out.println(str1.compareTo(str2));
        System.out.println(str.compareTo(str2));
    }
}
