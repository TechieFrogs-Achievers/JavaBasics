package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Exception4 
//{
   // public static void main(String[] args) throws Exception
{ 
    public static void findFile(int a,int b) //method
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
    //try bloack

    try
    {
      findFile(3, 5);
    } 
    //catch block
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    catch(IOException e) //// code that may produce IOException
    {
      System.out.println(e);
    }

    sc.close();
  }
}

