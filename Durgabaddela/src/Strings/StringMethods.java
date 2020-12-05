package Strings;

import java.util.Scanner;

public class StringMethods 
{
    public static void main(String[] args) 
    {
        String s1 = "Durga";
        String s2 = new String("  Baddela");
        System.out.println(s1.substring(5));//it gives string after 6th index
        System.out.println(s1.substring(0,5));//it gives sub string from index 0 to 6

        System.out.println(s1.toUpperCase());//it converts whole string into upper case
        System.out.println(s1.toLowerCase());//it converts whole string into lower case


        System.out.println(s2);
        System.out.println(s2.trim());//it deletes the spaces before and after string

        Scanner sc = new Scanner("Language");//here input gives from scanner class
        String name = sc.nextLine();
        System.out.println(name.length());//it gives length of the string
        System.out.println(name.startsWith("la"));//it checks is that string starts with m or not 
        System.out.println(name.endsWith("e"));//it gives true or false output 
        System.out.println(name.charAt(2));//it gives character at that index

        String str = name.replace("Java", "Python");//it replaces the java with python in string
        System.out.println(str);

        int k = 20;
        String m = String.valueOf(k);
        System.out.println(m+20);
        sc.close();
    }
}
