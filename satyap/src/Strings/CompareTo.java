package Strings;

import java.util.Scanner;

public class CompareTo //class for compareTo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); //scanner class
        String str=sc.next(); //string notations
        String str1=sc.next();
        String str2=sc.next();
        //String str="satya";
        //String str1="satya";
        //String str2="sasi";
        System.out.println(str.compareTo(str1)); // string comparison
        System.out.println(str1.compareTo(str2));
        System.out.println(str.compareTo(str2));
        sc.close(); //scanner close
    }
}
