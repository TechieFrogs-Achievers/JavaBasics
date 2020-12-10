package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram12 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length");
        Scanner sc = new Scanner(System.in);// scanner class
        int length = sc.nextInt();// array length
        int array[] = new int[length];//  array for storing elements
        for( int i =0; i < array.length; i++)
        {
            array[i] = sc.nextInt();// reading elements
        }
         int sum =0;// Integer variable
         for(int i =0; i < array.length; i++)// loop for sum of elements
         {
            sum = sum+array[i];// sum of elements and array elements
         }
         System.out.println(" The sum of the elements are : " + sum);
         sc.close();// closing scanner class
    }
    
}
