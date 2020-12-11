import java.util.*;
public class Exception13 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);

        //code to be  checked for an exception
        try
        {
            System.out.println("Enter a and b values");
            //initialize the variables from user        
            
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a / b ;           //division operation
            System.out.println("the value of c is :"+c);
        }
        catch(ArithmeticException e)        //handle the arithmetic exception
        {
            System.out.println("ArithmeticException - enter valid inputs");
        }
        catch(Exception e)          //to handle any other exception
        {
            System.out.println("enter valid inputs");
        }
        sc.close();

        
    }
}
