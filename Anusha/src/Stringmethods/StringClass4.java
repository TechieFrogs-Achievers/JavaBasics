package Stringmethods;
import java.util.*;
public class StringClass4 
{
 public static void main(String[] args) 
 {
     String s1="hello";
     String s2="hello world";
     String str=new String("hello");
     //comapre string using == operator
     System.out.println(s1==str);//false(because str refers to instance created in nonpool)  
     System.out.println(s1==s2);//false (because strings are different)
     Scanner sc=new Scanner(System.in);
     System.out.println("--------------------------------------");
     System.out.println("Enter string value1:");
     String a=sc.next();
     System.out.println("Enter string value2:");
     String b=sc.next();

     if(a==b)
     {
         System.out.println("true");
     }
     else{
         System.out.println("False");
     }

 }   
}
