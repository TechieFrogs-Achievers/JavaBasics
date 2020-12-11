package Exceptions;
import java.util.*;
public class ExceptionHandling14 
{
     public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size:");
      int size=sc.nextInt();//size of an array
       int arr[]=new int[size];
       System.out.println("enter element:");
       int a=sc.nextInt();
       try{
           System.out.println(arr[15]);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("The Specified index");
       }
    }
}
