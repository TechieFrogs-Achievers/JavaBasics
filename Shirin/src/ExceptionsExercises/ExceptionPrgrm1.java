package ExceptionsExercises;

import java.util.Scanner;

public class ExceptionPrgrm1 
{
    public static void main(String[] args)
    {   
        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in);    //scanner class
        int  a = sc.nextInt();     //Initiallizing variable for taking input
        int b = sc.nextInt();
        //try block
         
        try     
        {
            int c = a+b;      // sum of two values
            System.out.println(c);
        }

        // catch block
        // catch block handle exception 
        catch(Exception e)
        {
           System.out.println(" Exception occurs");
        }
        sc.close();

        
    }
    
}
