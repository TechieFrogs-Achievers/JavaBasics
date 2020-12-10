package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram19 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);    // scanner class
        int length = sc.nextInt();    // array length
        int secondsmallest[] = new int[length];   // array for storing the data elements
        for ( int i =0; i < secondsmallest.length; i++)
        {
            secondsmallest[i] = sc.nextInt();    // Reading the elements
        }
        for( int i=0; i < secondsmallest.length; i++)    // loop  for checking the first element
        {
            for(int j =i+1; j < secondsmallest.length; j++)    // loop for checking the second element
            {

                if(secondsmallest[i] > secondsmallest[j])    // checking array 1 element is lessthan  array2 
                {
                    int temp;          // temp  variable for storing the data elements
                    // sorting the elements
                    temp = secondsmallest[i];
                    secondsmallest[i] = secondsmallest[j];
                    secondsmallest[j] =temp;

                }
            }
        }

         System.out.println(" The  second smallest element :" + secondsmallest[secondsmallest.length-2]);// printing  the  second smallest element in array
         sc.close();   //  closing scanner class
        
        
    }
    
}
