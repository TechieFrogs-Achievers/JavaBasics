package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt(); //taking inputs from keyboard
        int b=sc.nextInt();
        int division;
        //try block 
        try{ 
            division=a/b; //arithmetic exception posiible case
            System.out.println(division);
        }
        catch(ArithmeticException ae) //catch block for handling  exception
        {
          System.out.println(ae);
        }
        catch(NullPointerException ne) // another catch block for  handling null pointer exception
        {
            System.out.println(ne);
        }
        catch(InputMismatchException ie)// another catch block for  handling InputMismatch exception
        {
            System.out.println(ie);
        }
        catch(Exception e) //catch block for super class
        {
            System.out.println("this is main exception");
        }
        sc.close();
    }
}
