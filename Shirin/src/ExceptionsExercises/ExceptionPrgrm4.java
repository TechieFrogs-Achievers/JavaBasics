package ExceptionsExercises;

import java.util.Scanner;

public class ExceptionPrgrm4 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the values");
        Scanner sc = new Scanner(System.in);   // scanner class
        int a = sc.nextInt();       // Initiallizing variable for taking inputs
        int b = sc.nextInt();
        // try block
        //it throws exception
        try
        { 
            method();
            int c = a / b;
            System.out.println("The division of c :" +c);
        }
        //catch block
        // it handles exception block
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException occur :" +e);
        }
        sc.close();           
    }
    // method for displaying exception
    private static void method() throws ArithmeticException    
    {
        System.out.println("Inner method");
        throw new ArithmeticException("it occurs exception");

    }
    
    
}
