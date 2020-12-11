package Exceptions;
import java.util.*;
public class ExceptionHandling22 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for taking input from user
        //taking inputs from console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3;
        try 
        {
            String str = null;
            System.out.println("The length of string is : " +str.length());            
        }
        //catch block
        catch (NullPointerException e) 
        {
            System.out.println("Exception occured");   
        }
        //another catch block
        catch(ArithmeticException a)
        {
            System.err.println("Arithmatic exception is occured");
        }
        //finally block
        finally
        {
            System.err.println("Finally block is excuted");
        }
        //last statement in program
        System.out.println("End of program");
        scan.close();           //scanner close
 
    }
}
