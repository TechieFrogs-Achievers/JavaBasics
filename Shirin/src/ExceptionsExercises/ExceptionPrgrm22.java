package ExceptionsExercises;

import java.util.Scanner;

public class ExceptionPrgrm22 
{
    public static void main(String[] args) 
    {
        System.out.println(" Emter the number");
        Scanner sc = new Scanner(System.in);  //scanner class 
        int num = sc.nextInt();       // Initiallizing variables for taking input
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // try block   it throws exception
        try
        { 
            String str = null;   //checks the string as null value
            System.out.println("length of the string is:"+str.length());
        }
        // catch block
        // it handles exception
        catch(NullPointerException n)   //outer catch  block
        {
            System.out.println("exception has occured:");
        }
        catch(ArithmeticException a)   //inner catch block
        {
            System.out.println("Arthimetic exception has occured:");

        }
        sc.close();  //scanner close
        
    }
    
}
