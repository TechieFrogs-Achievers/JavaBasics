package ArraysExercises;

import java.util.Scanner;

public class ArrayPrograms27 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);  // scanner class
        int  row = sc.nextInt();    // Initiallizing integer for reading row inputs
        int column = sc.nextInt();   // column inputs
        System.out.println("Eneter the elements :");
        int array[][] = new int[row][column];  // Initiallizing array for storing the data

        // loops for reading the input elements(rows & column)
        for ( int i =0; i < row; i++)
        {
            for( int j =0; j < column; j++)
            {
                array[i][j] = sc.nextInt();   // reading  array input elements 
            }
        }
         boolean flag = true;
         if ( row != column)  // if the row element  is not equal to column element 
         {
             System.out.println("The matrix should be same a square matrix");
         }
         else
         {
            for(int i =0; i <row; i++)  // loop checks the row elements
            {
                 for( int j =0; j < column; j++)  // loop check the column elements
                {
                     if(i==j && array[i][j]!=1) // if checking  elements and array elements are not equal to 1
                     {
                         flag = false;     // it breaks the loop
                         break;
                     }
                }
            }

        }
        if (flag)  // true
        {
            System.out.println("The matrix is Identify matrix");
        }
        else
        {
            System.out.println("The matrix is not Identify matrix");
        }
        sc.close();   // scanner  class close

        

        
    }    
}
