package Strings;

import java.util.Scanner;

public class PalindromeString 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String s = new StringBuffer(A).reverse().toString();//method to reverse the string
        System.out.println("reverse string ="+s);
        if(A.equalsIgnoreCase(s))//checks the palindrome condition
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("No a palindrome");
        }
        sc.close();
    }
}
