package Strings;

import java.util.Scanner;

public class SubstringIndexOf
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
        //taking input from keyboard
        String s1 = sc.nextLine();
        //String s2 = sc.nextLine();
        //index of method returns -1 if string not present 
          int value  =  s1.indexOf("a");//index method
          System.out.println(value);
          sc.close();  
  }  
}
