package Arrays;

import java.util.Scanner;

public class ArrayExample29 
{
    public static void main(String[] args)
     {
        //System.out.println("Enter the Length:");
        Scanner scan = new Scanner(System.in);              //scanner class object
        System.out.println("Enter the Matrix1 rows and columns number: ");     //taking matrix1 rows and columns size from user
        int matrix1_rows = scan.nextInt();
        int matrix1_columns = scan.nextInt();  //initializing the columns 
        System.out.println("Enter the matrix2 rows and columns number :");
        int matrix2_rows = scan.nextInt();
        int matrix2_columns = scan.nextInt();
        //creating two matrices
        int matrix1[][] = new int[matrix1_rows][matrix1_columns];
        int matrix2[][] = new int[matrix2_rows][matrix2_columns];
        //loop for reading matrix1 elements
        for(int i = 0; i < matrix1_rows; i++)
        {
            for(int j = 0; j < matrix1_columns; j++)
            {
                //reading matrix1 elements
                matrix1[i][j] = scan.nextInt();
            }
        }
        //loop for reading matrix2 elements
        for(int i = 0; i < matrix2_rows; i++)
        {
            for(int j = 0; j < matrix2_columns; j++)
            {
                //reading matrix2 elements
                matrix2[i][j] = scan.nextInt();
            }
        }

        int flag = 1;     //taking flag
        //if two matrices are equal then rows and columns of that two matrices are equal
        if(matrix1_rows == matrix2_rows || matrix1_columns ==matrix2_columns)
        {
            //loop for checking each element of two matrices
            for(int i = 0; i < matrix1_rows; i++)
            {
                for(int j = 0; j < matrix1_columns; j++)
                {
                    //checking elements in two matrices
                    if(matrix1[i][j] != matrix2[i][j])
                    {
                        flag =0;
                    }
                }
            }
            //flag is true than it prints equal
            if(flag == 1)
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

        
        scan.close();               //scanner close
        
    }
    
}
