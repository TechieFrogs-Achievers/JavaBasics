package Exceptions;

import java.util.Scanner;

public class Exception14 {
    public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);   //scanner class object
         int length = sc.nextInt();   //takes the value from the user
         int arr[]= new int[length];    //array that stores the data
         for(int i=0;i<arr.length;i++)
         {
             arr[i] = sc.nextInt();   //reads the array elements
         }
         try
         {
             System.out.println(length+1);     //exception occurs when more than 1 element  
         }
         catch(ArrayIndexOutOfBoundsException ie)    //catch block that occurs when the exception from try block gets and handle it
         {
             System.out.println(ie);   
         }
        System.out.println("rest of the program:");
        sc.close();   //scanner close
    }
}
