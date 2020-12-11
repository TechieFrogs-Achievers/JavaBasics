package Arrays;

import java.util.Scanner;

public class TwoMatrixEqual 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class 
        System.out.println("Enter the Matrix1 rows and columns : ");
        int matrix1_rows = scan.nextInt();
        int matrix1_columns = scan.nextInt();
        
        System.out.println("Enter the matrix2 rows and columns  :");
        int matrix2_rows = scan.nextInt();
        int matrix2_columns = scan.nextInt();
        //creating two matrices
        int matrix1[][] = new int[matrix1_rows][matrix1_columns];
        int matrix2[][] = new int[matrix2_rows][matrix2_columns];

        //loops for reading matrix1 elements
        for(int i = 0; i < matrix1_rows; i++)
        {
            for(int j = 0; j < matrix1_columns; j++)
            {
               
                matrix1[i][j] = scan.nextInt();    //reading matrix1 elements
            }
        }
        //loops for reading matrix2 elements
        for(int i = 0; i < matrix2_rows; i++)
        {
            for(int j = 0; j < matrix2_columns; j++)
            {
                
                matrix2[i][j] = scan.nextInt();    //reading matrix2 elements
            }
        }

        int flag = 1;     //taking flag
       
        if(matrix1_rows == matrix2_rows || matrix1_columns ==matrix2_columns)
        {
            
            for(int i = 0; i < matrix1_rows; i++)     //checking each element of two matrices
            {
                for(int j = 0; j < matrix1_columns; j++)
                {
                    
                    if(matrix1[i][j] != matrix2[i][j]) ///checking elements in two matrices
                    {
                        flag =0;
                    }
                }
            }
            
            if(flag == 1)  //flag is true
            {
                System.out.println("The two matrices are equal");
            }
            else
            {
                System.out.println("The two matrices are not equal");
            }
        }
        
        else //rows and columns are not equal
        {
            System.out.println("Matrices are not equal");
        }

        
        scan.close();               
        
    }
    
}
