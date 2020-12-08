package Strings;

import java.util.Scanner;

public class SwappingofString 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);//input user
        System.out.println("enter the String1");
        String str1 = sc.nextLine(); //read 1st string 
        System.out.println("enter the string2 ");
        String str2 = sc.nextLine(); //read 2nd string
        System.out.println("Before swap :" +str1+ " " +str2);
        str1 = str1+str2;// adding two strings 
        str2 =str1.substring(0,(str1.length()-str2.length())); //using substring method and substract str1-str2
        str1 =str1.substring(str2.length()); // finding len of string
        System.out.println("After swap :" +str1 + " " +str2);
        sc.close();
    }
}
