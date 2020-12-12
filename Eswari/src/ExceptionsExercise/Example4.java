package ExceptionsExercise;

import java.util.Scanner;

//class to handle exceptions using throws keyword
public class Example4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taling input from user
        //tsking values from console
        int value1 = scan.nextInt();    
        int value2 = scan.nextInt();
        int value3;
        //try method for exceptions
        try
        {
            method();
            value3 = value1 / value2;
            System.out.println("The value3 is : " +value3);
        }
        //catch method for handle exceptions
        catch(ArithmeticException ae)
        {
            System.out.println("The exception is " +ae);
        }
        scan.close();
    }
    //method and throws keyword
    public static void method()  throws ArithmeticException
    {
        System.out.println("Inside a method");
        throw new ArithmeticException("This is arithmetic Exception");      //throw exception
    }
    
}