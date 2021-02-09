package ExceptionHandling;

import java.util.Scanner;

public class Exception3
 {
     public static void main(String[] args) 
     {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);    //scanner  class
        int age = sc.nextInt();          // Initiallizing variable for taking input
         if ( age < 20)      // if age is less than 20 it throw exception 
         {
             throw new ArithmeticException(" invalid Input");    
         }
         else      
         {
             System.out.println(" age is matched");     
         }
         System.out.println("rest of the code excute");
        //sc.close();      // scanner class close
         
     }
    
}
