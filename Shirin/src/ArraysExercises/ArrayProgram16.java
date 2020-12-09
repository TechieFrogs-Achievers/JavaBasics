package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram16 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);// scanner class
        int length = sc.nextInt();// array length
        int largestarr[] = new int[length];// array for storing the data elements
        for ( int i =0; i < largestarr.length; i++)
        {
            largestarr[i] = sc.nextInt();// Reading the elements
        }
        for( int i=0; i < largestarr.length; i++)// loop  for checking the first element
        {
            for(int j =i+1; j < largestarr.length; j++)// loop for checking the second element
            {

                if(largestarr[i] < largestarr[j])// checking array 1 element is lessthan  array2 
                {
                    int temp;// temp  variable for storing the data elements
                    // sorting the elements
                    temp = largestarr[i];
                    largestarr[i] = largestarr[j];
                    largestarr[i] =temp;

                }
            }
        }

         System.out.println(" The  Third largest element :" + largestarr[largestarr.length-3]);// printing  the third largest element in array
         sc.close();//  closing scanner class
        
    }
        
    
    
}
