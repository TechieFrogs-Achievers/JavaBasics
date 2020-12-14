package Exceptions;

import java.util.Scanner;

public class ExceptionExercise3 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);    //scanner  class
        int age = sc.nextInt();     //input values
         if ( age < 20)      // if age is less than 20 it throw exception 
         {
             throw new ArithmeticException(" Invalid Input");    
         }
         else      
         {
             System.out.println(" Age is matched");     
         }
         System.out.println("rest of the code excute");
        // sc.close();      
        
    }
    
}
