package Exceptions;

import java.util.Scanner;

public class ExceptionExercise4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);   //scanner class
        
        int val1 = sc.nextInt();
        int val2 = sc.nextInt(); //input values
        int val3;   //stores the value of 2 values
        try
        {
            Display();   //creating the method
            val3 = val1/val2;    //divides the 2 values
            System.out.println("the val3 is:"+val3);    
        }
        catch(ArithmeticException e)     //catch block that handles the exception from the try block
        {
            System.out.println("exception is:"+e);
        }
        sc.close();  
    }
    public static void Display()
    {
        System.out.println("inside the display:");   //prints the method 
        throw new ArithmeticException("it is Arithmetic Exception:");   //throws the exception
    }
    
}
