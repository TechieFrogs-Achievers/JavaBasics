package Exceptions;

import java.util.Scanner;

public class ExceptionExercise22 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  //scanner class
        
        int val = sc.nextInt();
        int val1 = sc.nextInt(); //input values
        int val2 = sc.nextInt();
        try
        { 
            String str = null;   //checks the string as null value
            System.out.println("length of the string is:"+str.length());
        }
        catch(NullPointerException ne)   //outer catch block that checks the exceptions
        {
            System.out.println("exception has occured:");
        }
        catch(ArithmeticException ae)   //inner catch block
        {
            System.out.println("Arthimetic exception has occured:");

        }
        sc.close();  //scanner close
    }
    
    
}
