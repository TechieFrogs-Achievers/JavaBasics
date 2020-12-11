package Exceptions;
import java.util.*;
public class SumofInteger 
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);//scanner class
        
         try
         {
             System.out.println("enter a value: ");
            int a=sc.nextInt();
            System.out.println("enter b value: ");
            float b=sc.nextFloat();
            //logic for sum of two numbers
            float c = a + b;
            System.out.println(c);
    
         }//catch bock to catch exception
        catch(ArithmeticException  e){
            System.out.println(e);
        }
        //finally block
        finally
        {
           System.out.println(" finally block");
        }
        sc.close();
     
         
    }
}
