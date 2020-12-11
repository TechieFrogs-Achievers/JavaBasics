package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram15 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);// scanner class
        int length = sc.nextInt();// array length
        int array[] = new int[length];// array for storing the data elements
        for ( int i =0; i < array.length; i++)
        {
            array[i] = sc.nextInt();// Reading the elements
        }
        for( int i=0; i < array.length; i++)// loop  for checking the first element
        {
            for(int j =i+1; j < array.length; j++)// loop for checking the second element
            {

                if(array[i]<array[j])// checking array 1 element is lessthan  array2 
                {
                    int temp;// variable storing the data elements
                    // sorting the elements
                    temp = array[i];
                    array[i] = array[j];
                    array[j]= temp;

                }
            }
        }
        for ( int i =0 ; i < array.length; i++)// loop for printing the array elements 
        {
            System.out.println(array[i]);// printing elements in descending order
            
        }
        sc.close();//  closing scanner class
        
    }
    
}
