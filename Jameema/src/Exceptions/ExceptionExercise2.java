package Exceptions;

import java.util.Scanner;

public class ExceptionExercise2 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the elements");
         Scanner sc = new Scanner(System.in);   // scanner class 
         int a = sc.nextInt();   // input values
         int b = sc.nextInt();
         System.out.println(" Enter the string");
         String str = sc.nextLine();
         
        
        // try block  
        try
        {   
            int c = a/b;     //  it throws exception
             str = null;
            System.out.println(c);
            System.out.println(str.length());

        }
        catch(ArithmeticException  e)    // catch block handle the exception
        {
            System.out.println(" Arthimetic Exception occours");
        }
        catch(NullPointerException e)     // if the taking value is null 
        {
            System.out.println("NullpointerException occurs");    // prints nullpointerException 
        }
        catch(Exception e)     // catch block for super class
        { 
            System.out.println("rest of the code excute");
        }
        sc.close();   
        
    }
    
}
    

