package ArraysExercise;

import java.util.Scanner;

//class to print addition of two matrices
public class Example36
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int rows = scan.nextInt();                          //taking length of rows in matrix
        int columns = scan.nextInt();                       //taking length of columns in matrix 
        //creating 2-demensional array(i.e matrix )
        int matrix1[][] = new int[rows][columns];           
        int matrix2[][] = new int[rows][columns];
        int addition[][] = new int[rows][columns];

        //loops for taking matrix1 elements
        System.out.println("Enter the Matrix1 elements are : ");
        for(int i= 0; i < rows; i++)                //loop for taking rows in matrix
        {
            //loop for taking column elements
            for(int j = 0; j < columns; j++)            
            {
                //reading matrix1 elements
                matrix1[i][j] = scan.nextInt();
            }
        }
        //loops for taking matrix2 elements
        System.out.println("Enter the Matrix2 elements are : ");
        for(int i= 0; i < rows; i++)                    //loop for taking row elements for matrix2
        {
            //loop for taking column elements of matrix2
            for(int j = 0; j < columns; j++)
            {
                //reading matrix2 elements
                matrix2[i][j] = scan.nextInt();
            }
        }
        //loops for add the  two matrices
        for(int i= 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                //addition of two matrices
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        //loops for printing result of addition
        System.out.println("Addition of two matrices is :");
        for(int i = 0; i < rows; i++)
        {
            for(int j= 0; j < columns; j++)
            {
                //printing result
                System.out.print(addition[i][j] +"\t");
                
            }
            System.out.println();
        }
        scan.close();           //scanner close
    }
}