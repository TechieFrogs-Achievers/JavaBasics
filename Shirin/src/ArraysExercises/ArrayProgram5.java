package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram5 
{
    public static void main(String[] args) 
    {
        System.out.println(" enter the elements :");
        Scanner sc = new Scanner(System.in);//scanner class
         int length = sc.nextInt();// variable for reading elements
        int array[] = new int[length];// array for storing the elements
        for( int i =0 ; i < length; i++)// loop for checking the number of elemnets are in array 
        {   
            array[i] = sc.nextInt();// read given elements
           
        }
        for( int i=0; i < array.length; i++)  
        {
        System.out.println(array[i]);// print the elements
        sc.close();// closing scanner class
        }
        
    }
    
}
