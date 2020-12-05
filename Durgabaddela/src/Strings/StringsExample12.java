package Strings;

import java.util.Scanner;

public class StringsExample12 
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a string");
    String s = scan.nextLine();//object for string
    StringBuffer sb = new StringBuffer("Hi");//object for stringbuffer
    sb.append(s);//adding another string for original string
    System.out.println(sb);
    sb.delete(0,sb.length());//to clear the string
    System.out.println("clear string ="+sb);
    scan.close();//closing the scanner class
    }

}
