package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram4 
{
    public static void main(String[] args)
    {
        System.out.println(" Enter the length:");
        Scanner sc = new Scanner(System.in);//scanner class
        int length = sc.nextInt();// array length
        System.out.println("Enter the elements");
        int array[] = new int[length];// array for storing the elements
        for(int i =0; i < array.length; i++)
        {
            array[i]= sc.nextInt();// reading the elements
        }
        for( int i =0; i < array.length; i++)// loop checking   elements 
        {
            for(int j =i+1; j< array.length; j++)// loop checking next element
            {
                if ( array[i]==array[j])// if two arrays are equal the repeated element will be print
                {
                    System.out.println(array[j]);// printing duplicate element
                }
            }
        }
        sc.close();// closing scanner class
        
    }
    
}
