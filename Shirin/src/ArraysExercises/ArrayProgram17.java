package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram17 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);// scanner class
        int length = sc.nextInt();// array length
        int secondlargest[] = new int[length];// array for storing the data elements
        for ( int i =0; i < secondlargest.length; i++)
        {
            secondlargest[i] = sc.nextInt();// Reading the elements
        }
        for( int i=0; i < secondlargest.length; i++)// loop  for checking the first element
        {
            for(int j =i+1; j < secondlargest.length; j++)// loop for checking the second element
            {

                if(secondlargest[i] > secondlargest[j])// checking array 1 element is lessthan  array2 
                {
                    int temp;// temp  variable for storing the data elements
                    // sorting the elements
                    temp = secondlargest[i];
                    secondlargest[i] = secondlargest[j];
                    secondlargest[j] =temp;

                }
            }
        }

         System.out.println(" The  second  largest element :" + secondlargest[secondlargest.length-2]);// printing  the  second largest element in array
         sc.close();//  closing scanner class
        
        
    }
    
}
