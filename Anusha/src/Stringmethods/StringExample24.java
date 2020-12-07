package Stringmethods;
import java.util.*;
public class StringExample24 
{
    public static void main(String[] args) 
    {
        //taking the input from user by using scanner class
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String1:");
      String str1=sc.nextLine();   
      System.out.println("Enter String2:");
      String str2=sc.nextLine();  
      System.out.println("Before swap: " +"string1: " + str1 + " " + "string1: "+ str2); 
      //swap two strings
      // append 2nd string to 1st 
       str1=str1+str2;
       str2 = str1.substring(0, str1.length() - str2.length());  // store intial string str1 in string str2 
        str1 = str1.substring(str2.length());// store initial string str2 in string str1
        System.out.println("After swap: " +"string1: " + str1 + " " + "string1: "+ str2);
    }
}
