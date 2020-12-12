package ExceptionsExercises;

import java.util.Scanner;

public class ExceptionPrgrm14 
{
    public static void main(String[] args) 
    {   
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);   //scanner class 
        int length = sc.nextInt();         // array length
        int arr[]= new int[length];    //array  for storing the data
        for(int i=0;i<=arr.length;i++)
        {
            arr[i] = sc.nextInt();   //Reading  inputs
        }
        // try block it throws exception
        try
        {
            System.out.println(length+1);       
        }
        // catch block
        // it handles exception
        catch(ArrayIndexOutOfBoundsException e)   
        {
            System.out.println(e);   
        }
       System.out.println("Rest of the program Excecute");
       sc.close();   //scanner class close
        
    }
    
}
