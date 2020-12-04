package Strings;

import java.util.Scanner;

public class IndexofString 
{
    public static void main(String[] args) 
    {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in); //scanner class
        String str = sc.nextLine(); //input value
        String str2 = sc.nextLine();
        System.out.println("the index of string " +str.indexOf('a')); //it gives the char index in string
        System.out.println("string one contains string 2 :" +str.contains(str2)); //it gives the boolean value
        System.out.println("the index of str2 :" +str.indexOf(str2)); //it hives the index value in string 1jemmi
        sc.close();
        
    }
    
}
