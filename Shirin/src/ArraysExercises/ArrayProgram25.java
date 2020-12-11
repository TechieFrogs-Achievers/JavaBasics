package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram25 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);      //scanner class
        int length = sc.nextInt();         // array length
        System.out.println(" Enter the elements :");
        int arr1[][] = new int[length][length];       //Initiallizing array for matrix

        for(int i =0; i <arr1.length; i++)     // loop for taking the row elements
        {
            for(int j =0; j < arr1.length; j++)     // cloumn
            { 
                arr1[i][j]=sc.nextInt();      //reading input

            }
        }
        int transpose[][] = new int[length][length];     // Integer for storing  the data
        System.out.println("After transposing the matrix");
        for(int i =0; i < arr1.length; i++)      // loop for checking the elements in row
        {
            for(int j =0; j < arr1.length;j++)    // column
            {
                transpose[i][j] = arr1[j][i];      // condition for converting the elements into  Row to column/ column to row
            
              System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();  // scanner class close

        
    }
    
}
