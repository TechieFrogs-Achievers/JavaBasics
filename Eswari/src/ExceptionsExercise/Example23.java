package ExceptionsExercise;

import java.util.Scanner;

//class to try, catch, finally block
public class Example23 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        //taking two numbers from console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3;
        //try block for taking exceptions
        try
        {
            number3 = number1/ number2;
            System.out.println("The number is : " +number3);
        }
        //catch block for handling exceptions
        catch(ArithmeticException a)
        {
            System.out.println("Exception occured");
            System.out.println(a);
        }
        //finally block(it excutes if exception is occured or not)
        finally
        {
            System.out.println("Finally block excuted");
        }
        System.out.println("End of program");
        scan.close();           //scanner close
    }
    
}
