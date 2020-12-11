package Exceptions;

import java.util.Scanner;

public class MultipleCatchBlocks 
{
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);//scanner class
     System.out.println("Enter the divisor to divide 100: ");   
     int divisor =sc.nextInt();//enter divisor
     try
     {
     int[] array=new int[10];//create an array with size 10
     int result=100/divisor;//condition for division
     array[10]=result;//store result in array
     }
     catch(ArithmeticException ex)//catch block for arithmetic exception
     {
         System.out.println("Arithmetic exception ");
     }
     catch(ArrayIndexOutOfBoundsException ex)//catch block for arrayindexoutofbound
     {
         System.out.println("Array index out off bounds exception has occutred");
     }
     catch(Exception e)//common exception
     {
         System.out.println("Exception occurred");
     }
    }
}
