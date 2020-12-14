package Exceptions;

import java.io.IOException;
import java.util.InputMismatchException;

public class Exception10 
{
    public static void main(String[] args) 
    {
        //try block
        try{
            int a= 19,b=0;
            int c =a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)//catch block to handle the exception
        {
            System.out.println(e);
        }
        catch(IllegalArgumentException ie) //another catch block to handle the exception
        {
           System.out.println(ie);
        }
    }
}
