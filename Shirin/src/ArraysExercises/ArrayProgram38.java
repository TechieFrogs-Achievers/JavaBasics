package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram38 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);   // scanner class
        int length = sc.nextInt();    // array length
        int array[] = new int[length];   // array for storing the elements
        int avg ,sum =0;
        for( int  i = 0 ; i < array.length; i++)   //loop for reading inputs
        {
            array[i] = sc.nextInt();
        }
        for(int i = 0 ; i < array.length; i++ )   // loop for taking the elements
        {
             sum = sum +array[i];//   
        }
        avg = sum/array.length;    // printing  average of the elements 
        System.out.println( "The Average of the  array " +avg);
        sc.close();

        
    }
    
}
