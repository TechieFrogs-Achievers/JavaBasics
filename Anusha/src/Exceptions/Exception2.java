package Exceptions;
import java.util.*;
public class Exception2 
{
   public static void main(String[] args) 
   {
       Scanner sc=new Scanner(System.in);//scanner class
       System.out.println("enter size:");
       int size=sc.nextInt();//size of an array
        int arr[]=new int[size];
        System.out.println("enter element:");
        int a=sc.nextInt();
        System.out.println("enter element:");
        int b=sc.nextInt();
         
    try
    {
          size=a/b;//arithmetic condition
         
     } 
    catch(ArithmeticException   e)//catch block for exception
    {
        System.out.println(e.getMessage());
    } 
    catch(ArrayIndexOutOfBoundsException e)//catch box for out of index
     {
        System.out.println(e.getMessage());
     }
     
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
   } 
}
