package ArraysExercise;

import java.util.Scanner;

//class to print multiplication of two matrices
public class Example33 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        System.out.println("Enter the rows and columns of matrix1:");
        int rows1 = scan.nextInt();                          //taking length of rows in matrix
        int columns1 = scan.nextInt();                       //taking length of columns in matrix
        System.out.println("Enter the rows and columns of matrix2:");
        int rows2 = scan.nextInt(); 
        int columns2 = scan.nextInt();      
        //creating 2-demensional array(i.e matrix )
        int matrix1[][] = new int[rows1][columns1];           
        int matrix2[][] = new int[rows2][columns2];
        int multiplication[][] = new int[rows1][columns2];

        //loops for taking matrix1 elements
        System.out.println("Enter the Matrix1 elements are : ");
        for(int i= 0; i < rows1; i++)                //loop for taking rows in matrix
        {
            //loop for taking column elements
            for(int j = 0; j < columns1; j++)            
            {
                //reading matrix1 elements
                matrix1[i][j] = scan.nextInt();
                // matrix2[i][j] = scan.nextInt();
            }
        }
        //loops for taking matrix2 elements
        System.out.println("Enter the Matrix2 elements are : ");
        for(int i= 0; i < rows2; i++)                    //loop for taking row elements for matrix2
        {
            //loop for taking column elements of matrix2
            for(int j = 0; j < columns2; j++)
            {
                //reading matrix2 elements
                matrix2[i][j] = scan.nextInt();
            }
        }
        //if matrix1 columns and matrix2 rows are not equal then multiplication is not possible
        if(columns1 != rows2)
        {
            System.out.println("Multiplication is not possible");
        }
        else
        {
            //loops for multiplication of the  two matrices
            for(int i= 0; i < rows1; i++)
            {
                for(int j = 0; j < columns2; j++)
                {
                    multiplication[i][j] = 0;
                    for(int k = 0; k < rows2; k++)
                    {
                        multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            //loops for printing result of multiplication
            System.out.println("Multiplication of two matrices is :");
            for(int i = 0; i < rows1; i++)
            {
                for(int j= 0; j < columns2; j++)
                {
                    //printing result
                    System.out.print(multiplication[i][j] +"\t");
                    
                }
                System.out.println();
            }
        }
        
        scan.close();           //scanner close
    }
    
}
