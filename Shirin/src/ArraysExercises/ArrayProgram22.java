package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram22 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the length :");
        Scanner sc = new Scanner(System.in);// scanner class
        int length = sc.nextInt();// array length
        System.out.println("Enter the  number");
        int array[] = new int[length];// Initiallizing array for storing the data elements
        for ( int i =0; i < array.length; i++)
        {
            array[i] = sc.nextInt();// Reading input
        }
        for( int i = 0; i < array.length;i++)// loop  for checking the even numbers in array
        {
            if(array[i]%2==0)//condition for even  
            {
                System.out.println("THE EVEN NUMBER :" +array[i]);// printimg the even number in array
            }
        }
        for( int j = 0; j < array.length; j++)// loop for checking the odd numbers
        {
            if(array[j]%2 !=0)// condition for odd
            {
                System.out.println("THE ODD NUMBER :" +array[j]);//printing the odd numbers 
            }
        }
        sc.close(); // closing scanner class



        
    }
    
}
