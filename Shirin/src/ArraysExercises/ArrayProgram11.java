package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram11 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length");
        Scanner sc = new Scanner(System.in);//scanner class
        int length = sc.nextInt();// array length
        int array[] = new int[length];// array for storing the elements
        for( int i =0 ; i < array.length; i++)
        {
            array[i] = sc.nextInt();//reading the array elements 
        }
         System.out.println(array.length);// print the  lenght of the given array
         sc.close(); // closing scanner class
        

    }
    
}
