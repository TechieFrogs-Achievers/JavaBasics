package Strings;

import java.util.Scanner;

public class StringSpaces12 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the String:");  //enter the user input
        Scanner sc =  new Scanner(System.in);   //scanner class object
        String str = sc.nextLine();   //string creation 
        String str1 = str.replace("","sai");    //string that to be replaced 
        System.out.println("Before replacing:"+str);   //prints the string before replaced 
        System.out.println("After replacing:"+str1);   //prints the string after replacing with string str
        sc.close();   //scanner close
    }
    
}
