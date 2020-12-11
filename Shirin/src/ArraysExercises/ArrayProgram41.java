package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram41 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);    //scanner class
        int rows = sc.nextInt();
        int columns= sc.nextInt(); 
        int marr1[][] = new int[rows][columns];   //array for  first matrix data
        int marr2[][] = new int[rows][columns];   //array for  second matrix data
        
        System.out.println(" enter the first matrix ");
        for(int i =0 ; i < rows; i++ )   //loop for checking the first matrix (row elements) 
        {
            for(int j =0; j < columns; j++)   //column
            {
                marr1[i][j] = sc.nextInt();   //reading the elements   
            }
        }
        System.out.println("Enter the second matrix");
        for(int i = 0; i < rows; i++)    //loop for checking the second matrix(row elements) 
        {
            for(int j =0; j < columns; j++)  // column
            {
                marr2[i][j] = sc.nextInt();
            }
        } 
            int marr3[][] = new int[rows][columns];    // creating another matrix to store the data of two matrices
            System.out.println(" Adding of two matrices are :");
            for(int i = 0; i < rows; i++)    // loop for checking the first matrix 
            {
                for(int j =0 ; j < columns; j++)    // loop for checking the second matrix
                {
                    marr3[i][j] = marr1[i][j]+marr2[i][j];    //condition for adding two matrices 
                    System.out.print(marr3[i][j]+ " ");
                }
                System.out.println();
            }
              sc.close();    // scanner class close

        
    }
    
}
