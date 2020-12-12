package Exceptions;
import java.util.*;
public class ExceptionHandling13 
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
      size=a/b;//condition for arithemetic exception
    
 } 
 catch(ArithmeticException   e)
 {
     System.out.println(e.getMessage());
 } 
 finally
 {
     System.out.println("end of the program:");
 }
    }
}
