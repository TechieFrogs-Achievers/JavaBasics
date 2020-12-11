package Exceptions;

import java.util.Scanner;

public class ExceptionExample1 
{
    public static void main(String[] args) 
    {
        int sum;
        Scanner sc = new Scanner(System.in);  //scanner class object
        int a=sc.nextInt();   //input values
        int b=sc.nextInt();
        try
        {
            sum =a/b; 
            System.out.println(sum);  //prints the sum

        }
        catch(ArithmeticException e)   //catch block that throws the exception
        {
            System.out.println(e);   //prints the exception
        }
        catch(NullPointerException e)   
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        sc.close();   //scanner close

        
    }
    
}
