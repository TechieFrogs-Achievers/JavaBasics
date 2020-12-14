package ExceptionsExercises;

import java.util.Scanner;

public class ExceptionPrgrm15 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the num");
        Scanner sc = new Scanner(System.in);     // scanner class
        int length = sc.nextInt();    // array class

        // try block throws exception
        try
        {
            int array[] = new int[length];
        }
        // catch block
        // it handles exception
        catch(NegativeArraySizeException e)
        {
            System.out.println("NegativeArraySizeException occurs");
        }
        System.out.println(" Rest of the program excecute");
        sc.close();   // scanner class close
        
    }
    
}
