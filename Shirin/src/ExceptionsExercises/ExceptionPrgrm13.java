package ExceptionsExercises;

import java.util.Scanner;

public class ExceptionPrgrm13 
{ 
    public static void main(String[] args) 
    {
        System.out.println("Enter the numbers :");
        Scanner sc = new Scanner (System.in);     // scanner class
        int a = sc.nextInt();         // Initiallizing variable for taking input
        int b = sc.nextInt();

        // try block
        // it throws exception
        try
        { 
            int c = a/b;      // Division operation perform
            System.out.println("Division of c  " +c);
        }
         
        // catch block
        // it handles the exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("The A and B Is not divided by zero ");
        }
        System.out.println("Rest of the code Excecute");
        sc.close();     //scanner class close
    }
    
}
