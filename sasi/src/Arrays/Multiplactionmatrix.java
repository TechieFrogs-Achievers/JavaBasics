package Arrays;

import java.util.Scanner;

public class Multiplactionmatrix 
{
    public static void main(String[] args) 
        {
            System.out.println("Enter the elements:");
            Scanner sc = new Scanner(System.in);  //scanner class object
            int row = sc.nextInt();      //initializing the row
            int column = sc.nextInt();  //initializing the column
            //matrix array that stores the elements
            int matrix1[][] = new int[row][column]; 
            int matrix2[][] = new int[row][column];
            System.out.println("Enter the first matrix:");
            //loop that checks the matrix1 elements
            for(int i=0;i<matrix1.length;i++)   
            {
                for(int j=0;j<matrix1.length;j++)
                {
                    matrix1[i][j] = sc.nextInt();  //reads the matrix1 elements
                }
            }
            System.out.println("Enter the second matrix:");
            //loop that checks the matrix2 elements
            for(int i=0;i<matrix2.length;i++)
            {
                for(int j=0;j<matrix2.length;j++)
                {
                    matrix2[i][j]=sc.nextInt();  //reads the matrix2 elements
                }
            }
            int matrix3[][] = new int[row][column];
            System.out.println("Multiplication of two matrices:");
            for(int i=0;i<matrix3.length;i++)  
            {
                for(int j=0;j<matrix3.length;j++)
                {
                    matrix3[i][j] =0;  
                    for(int k=0;k<matrix3.length;k++)
                    {
                        matrix3[i][j]=matrix1[i][k]*matrix2[k][j];  //performs the multiplication3 of matrix1 and matrix2 
                    }
                    System.out.print(matrix3[i][j]+" ");  //prints the result
                }
                System.out.println();
            }
            sc.close();  //scanner close
            
            
        }
        
    }
    
