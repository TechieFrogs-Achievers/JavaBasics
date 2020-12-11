package Exceptions;

import java.util.Scanner;

public class ExceptionHandling20 
{
    static void numberConversion(String input)//static mrthod for exception
    {
        try
        {
           int number=Integer.parseInt(input);//condition for exception on try block
           System.out.println("the input interger after conversation is:"+number);
        }
        catch(NumberFormatException ex)//catch block for NumberFormatException
        {
            System.out.println("Error!! while converting input to interger");
        }
    }
   public static void main(String[] args) 
   {
       Scanner sc =new Scanner(System.in);//scanner class
       System.out.println("Enter the string to be converted to an interger: ");
       String input=sc.nextLine();
       numberConversion(input);//method calling
   } 
}
