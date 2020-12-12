package Exceptions;

import java.util.Scanner;

public class ExceptionExercise15 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);   //scanner class 
        int length = sc.nextInt();   //input values
        try
        {
            int arr[] = new int[length];  //reads the array elemnets
        }
        catch(NegativeArraySizeException n)   //catch block that handles the exception from the try block
         {
            System.out.println("the array size cannot be negative number:");
        }  
        System.out.println("rest of the program:");      
        sc.close();   //scanner close
    }
    
}
