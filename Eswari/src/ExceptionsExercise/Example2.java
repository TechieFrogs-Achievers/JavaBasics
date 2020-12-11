package ExceptionsExercise;
import java.util.Scanner;

//class to multiple catch blocks
public class Example2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for taking input from user
        System.out.println("Enter the values of a and b :");
        //taking two integer values from console
        int a = scan.nextInt();
        int b = scan.nextInt();
        //try block for checking exceptions 
        try
        {
            //dividing two numbers
            int c = a / b;
            System.out.println("The value of c : " +c);
        }
        //catch block for checking occuring exception is arithmatic exception or not
        catch(ArithmeticException ae)
        {
            System.out.println("A number cannot be divided by 0");
        }
        //catch block for checking occuring exception is numberformat exception or not
        catch(NumberFormatException n)
        {
            System.out.println("We are given invalid data types for performing operation");
        }
        //catch block for checking occuring exception is runtime exception or not
        catch(RuntimeException r)
        {
            System.out.println("Runtime exception occurs");
        }
        System.out.println("Try catch exception is over");
        scan.close();               //scanner close
    }
}