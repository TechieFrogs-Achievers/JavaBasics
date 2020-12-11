package ExceptionsExercise;

import java.util.Scanner;

//class for handling arithmatic exception
public class Example13 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        System.out.println("Enter two values: ");       
        //taking two values from user
        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        //try block for exceptions
        try
        {
            //dividing first number by second number
            int value3 = value1 / value2;
            System.out.println("The value3 is : " +value3);
        }   
        //catching exceptions from try block and handling in catch block
        catch(ArithmeticException a)
        {
            System.out.println(a);
            // System.out.println("The value3 is : " +value3);
            System.out.println("The number is not divided by zero");
        }
        System.out.println("End of program");
        scan.close();           //scanner class
    }
}
