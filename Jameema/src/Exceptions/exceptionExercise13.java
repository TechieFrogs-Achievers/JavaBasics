package Exceptions;

import java.util.Scanner;

public class exceptionExercise13 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);   //scanner class 
        System.out.println("enter the value:");
        int val1 = sc.nextInt();    //assigning values on console   
        int val2 = sc.nextInt();
        try
        {
            int val3 = val1/val2;    //dvides the val1/val2
            System.out.println("val3 is:"+val3);
        }
        catch(ArithmeticException e)   //displays the exception that is from try block
        {
            System.out.println(e);
            System.out.println("number not divided by 0:");   //if it is exception in try block then it returns that number not divided by 0
        }
         System.out.println("rest of program:");
        sc.close();    //scanner close


        
    }
    
}
