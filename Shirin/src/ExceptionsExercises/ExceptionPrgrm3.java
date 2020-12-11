package ExceptionsExercises;

import java.util.Scanner;

public class ExceptionPrgrm3 
{
    public static void main(String[] args) 
    {     
         //.... using throw keyword..//
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);    //scanner  class
        int age = sc.nextInt();          // Initiallizing variable for taking input
         if ( age < 20)      // if age is less than 20 it throw exception 
         {
             throw new ArithmeticException(" Invalid Input");    
         }
         else      
         {
             System.out.println(" Age is matched");     
         }
         System.out.println("rest of the code excute");
        // sc.close();      // scanner class close


        
    }
    
    
}
