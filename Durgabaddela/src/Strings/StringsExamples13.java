package Strings;

import java.util.Scanner;

public class StringsExamples13 
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a string");
    String s = scan.nextLine();//object for string
    StringBuffer sb = new StringBuffer("Hi");//object for stringbuffer
    sb.append(s);//adding another string for original string
    System.out.println(sb);

    sb.setLength(4);//set length method to clear the requiredncharacters
    System.out.println("new String ="+sb);
    sb.setLength(0);
    System.out.println("another new string="+sb);
   scan.close();
}
}
