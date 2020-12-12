package Exceptions;
import java.util.*;
public class ExceptionHandling23 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);   //scanner class
        //assigns values from the console
        int val1 = sc.nextInt();   
        int val2 = sc.nextInt();
        int val3;
        try
        {  
            val3 = val1/val2;  //divides the val1/val2 and stores in val3
            System.out.println("val3 is:"+val3);   //prints the val3
        }
        catch(ArithmeticException ae)  //catch block that handles exceptions from the try block
        {
            System.out.println("Exception has occured:");
            System.out.println(ae); //prints the  arthimetic exception
        }
        finally
        {
            System.out.println("finally block will be excuted:");    //finall block excutes if exception is occured or not
        }
        System.out.println("rest of the code:");
        sc.close();   //scanner close
 
    }
}
