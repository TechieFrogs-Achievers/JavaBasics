package Strings;

import java.util.Scanner;

public class StringMethod 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s =sc.next(); 
        String s1=sc.next();
        //String s1="sasi";
       // String s2="bhanu";
        String s3=new String("sasi");
        System.out.println(s.equals(s1));  //  compare two strings  values
        System.out.println(s==s1); // comparing two string with their reference object
        System.out.println(s.concat(s1)); // adding two strings
        System.out.println(s.trim());// it remove strat and end spaces 
      //  System.out.println(s.compareTo(s1)); // comparing two strings  if equal=0 0r s>s1=1 or s<s1=-1
       // System.out.println(s1.compareTo(s));
       System.out.println(s1==s3); //comparing strings with new object
       System.out.println(s.contains(s1));// passes booleons values
       System.out.println(s.toUpperCase());// converts in capital letters 
      // System.out.println(s.indexOf("bhanu")); 
      sc.close();

    }
}
