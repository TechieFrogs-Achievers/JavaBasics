package Strings;

import java.util.Scanner;

public class ReplaceSpacetoString 
{
    public static void main(String[] args) 
    {
        System.out.println("enter the string :");
        Scanner sc = new Scanner(System.in);//scanner class
        String str = sc.nextLine();// input
        String str1 = str.replace(" ", "a");// replacethe first string space with another character
        System.out.println("before replace " + str);
        System.out.println("After replace :" +str1);  //space is replaced by character
        sc.close();
        
    }
    
}
