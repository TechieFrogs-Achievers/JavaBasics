package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram23 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the length :");
        Scanner sc = new Scanner(System.in);// scanner class
        int length = sc.nextInt();// array length
        System.out.println("Enter the  elements");
        int array[] = new int[length];// Initiallizing array for storing the data elements
        for ( int i =0; i < array.length; i++)
        {
            array[i] = sc.nextInt();// Reading input
        }
        Arrays.sort(array);// function for sorting the elements
        for ( int i =0; i < array.length; i++)// reading the input elements from array
        {
            System.out.println(array[i]);// printing

        }

        sc.close(); // closing scanner class

        
    }
    
}
