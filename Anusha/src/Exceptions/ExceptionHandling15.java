package Exceptions;

import java.util.Scanner;

public class ExceptionHandling15 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);//scanner class
        System.out.println("Enter the size:");
        int size=sc.nextInt();//take the size form console
        try
        {
           int[] arr=new int[size];//condition for exception
        }
        catch(NegativeArraySizeException ex)//catch block for exception
        {
            System.out.println("can't create array of negative size");
        }
    }
}
