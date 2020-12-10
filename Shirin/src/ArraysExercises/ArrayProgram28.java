package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram28 
{
    public static void main(String[] args) 
    {
        System.out.println("enter the length:");
        Scanner sc = new Scanner(System.in);    // scanner class
        int rows = sc.nextInt();     // Initiallizing row length
        int columns = sc.nextInt();   // column length
        System.out.println("Enter the elements");
        int marr[][] = new int [rows][columns];   // array for storing the data
        int numofzeros = 0 , nonzeros =0;  // Integer
        for( int i =0 ; i < rows; i++ )    // loop for reading the input elements
        {
            for( int j =0; j <columns; j++)
            {
                marr[i][j] = sc.nextInt();
            }

        }
        for( int i =0; i < rows; i++)    // loop  for checking the row element
        {
            for ( int j =0; j < columns;j++)    // column elements
            {
                if(marr[i][j]==0)    // it checks elements in marr is zero or not
                {
                    numofzeros++;     // then the numofzeros increace
                }
                else
                {
                    nonzeros++;    // if the element is not zero nonzeros increase

                }
            }
        }
        if(numofzeros > nonzeros)   // if numofzeros is greater than non zeros it print sparse matrix
        {
            System.out.println("The given number is sparse matrix ");
        }
        else
        {
            System.out.println(" The give number is not a sparse matrix");
        }
        sc.close();    // scanner class close
        
    }
    
}
