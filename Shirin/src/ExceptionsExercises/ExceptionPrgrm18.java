package ExceptionsExercises;

import java.util.Scanner;

public class ExceptionPrgrm18 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter  the integer");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        // try block it throws exception
        try
        {
            if( marks > 100)  throw new IllegalArgumentException(" the value must be  less than 100 and it also be non negative ");
            System.out.println("valid input :" +marks);
        }
        // catch block
        // it handles exception
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalExcepion occurs  ");
        }
        
        
    }
    
}
