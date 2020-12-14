package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram29 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);              //scanner class object
        System.out.println("Enter the matrix1 elements ");   //taking matrix1 rows and columns size from user
        int matrix1_rows = sc.nextInt();
        int matrix1_columns = sc.nextInt();  //initializing the columns 
        System.out.println("Enter the matrix2  elements :");
        int matrix2_rows = sc.nextInt();
        int matrix2_columns = sc.nextInt();
        //creating two matrices
        int matrix1[][] = new int[matrix1_rows][matrix1_columns];
        int matrix2[][] = new int[matrix2_rows][matrix2_columns];
        
        for(int i = 0; i < matrix1_rows; i++)     //loop for taking matrix1 elements
        {
            for(int j = 0; j < matrix1_columns; j++)
            {
                
                matrix1[i][j] = sc.nextInt();    //reading  elements

            }
        }
        
        for(int i = 0; i < matrix2_rows; i++)    // loop for taking matrix2 elements rows
        {
            for(int j = 0; j < matrix2_columns; j++)   // columns
            {
                
                matrix2[i][j] = sc.nextInt();   //reading  elements

            }
        }

        int flag = 1;     
        //if two matrices are equal then rows and columns of that two matrices are equal
        if(matrix1_rows == matrix2_rows || matrix1_columns ==matrix2_columns)  
        {
            
            for(int i = 0; i < matrix1_rows; i++)      //loop for checking each element of two matrices
            {
                for(int j = 0; j < matrix1_columns; j++)
                {
                    
                    if(matrix1[i][j] != matrix2[i][j])      //if matrix1  is not equal to matrix2  flag variable is set to zero

                    {
                        flag =0;     
                    }
                }
            }
           
            if(flag == 1)     //flag is true than it prints equal
            {
                System.out.println("The two matrices are equal");
            }
            else
            {
                System.out.println("The two matrices are not equal");
            }
        }
        //if rows and columns of two matrices are not equal then it prints not equal
        else
        {
            System.out.println("Matrices are not equal");
        }

        
        sc.close();     // scanner class closing          
        
    }
    
}
