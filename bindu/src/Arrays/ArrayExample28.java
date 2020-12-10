package Arrays;

import java.util.Scanner;

public class ArrayExample28 
{
    public static void main(String[] args) 
    {
        System.out.println("enter the length:");
        Scanner sc = new Scanner(System.in);    // scanner class
        int rows = sc.nextInt();             // Initiallizing row length
        int columns = sc.nextInt();      // initializing the columns
        System.out.println("Enter the elements");
        int matrix[][] = new int [rows][columns];    //initializing the array for storing the elements
        int numofzeros = 0 , nonzeros =0;        // Integer
        for( int i =0 ; i < rows; i++ )      // loop for reading the input elements
        {
            for( int j =0; j <columns; j++)
            {
                matrix[i][j] = sc.nextInt();
            }

        }
        for( int i =0; i < rows; i++)         // loop that checks for the row element
        {
            for ( int j =0; j < columns;j++)        // checks the column elements
            {
                if(matrix[i][j]==0)      //checks the matrix if equals then zeros increase
                {
                    numofzeros++;      
                }
                else
                {
                    nonzeros++;   //the nonzeros increases   

                }
            }
        }
        if(numofzeros > nonzeros)     // if numofzeros is greater than non zeros it print sparse matrix
        {
            System.out.println("The given number is sparse matrix ");
        }
        else
        {
            System.out.println(" The give number is not a sparse matrix");
        }
        sc.close();// scanner class close
        
    }
    
}
