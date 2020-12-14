package ExceptionsExercises;

import java.util.Scanner;

public class ExceptionPrgrm23 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the numbers");
        Scanner sc = new Scanner(System.in);   // scanner class
        int a = sc.nextInt();          // Initiallizing variable for taking Inputs
        int b = sc.nextInt();

        // try block
        // it throws exception
        try
        {
            int c = a/b;
            System.out.println(" The Division is:" +c);

        }
        // catch block
        // this block handles exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("ArthmeticException occurs");
        }
        // finally block
        // it shows if exeception is occur or not
        finally
        {
            System.out.println(" Finally block Excute");
        }
        System.out.println("Rest of the program");
        sc.close();
        
    }
    
}
