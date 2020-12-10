import java.util.Scanner;

public class ExceptionHandling6 
{
     public static void main(String[] args) 
    {
      try
    {
        int a=10, b=1;
        int c=a+b;// adding of two numbers 
        System.out.println(c);
    }
    catch(ArithmeticException e)//catch block
    {
        System.out.println("a and b values");
    }
    }
}
