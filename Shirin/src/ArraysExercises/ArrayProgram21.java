package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram21 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);     //scanner class
        int length = sc.nextInt();       // array length
        System.out.println("Enter the elements");
        int array[] = new int[length];      // array for storing the data
        for(int i =0 ; i < array.length; i++)   // loop for   checking input
        {
            array[i] = sc.nextInt();       // reading input
        } 
        for(int i =0; i < length; i++)     // loop for checking the first element in array
        {
            for( int j= i+1; j < length; j++)       // loop for checking the second element in array
            {
            
                    if(array[i]==array[j])        // if two elements are equal then duplicate value store in another variable
                    {
                        for( int k = j ; k < length-1; k++)    // loop for  taking duplicate element 
                        {
                           array[k] = array[k+1]; 
                        }
                        length = length-1;      // decrease the length of the array

                    }
                
            }
        
        }
        System.out.println("After Removing duplicate elements");
        for(int i = 0; i < length ; i++)
        {
            System.out.print(array[i]+ " ");
        }
        sc.close();   // scanner class close
        
    }
    
}
