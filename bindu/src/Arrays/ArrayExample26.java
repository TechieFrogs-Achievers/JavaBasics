package Arrays;

import java.util.Scanner;

public class ArrayExample26 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the elements:");
        Scanner sc = new Scanner(System.in);  //scanner class object
        int rows =sc.nextInt(); //initializing the rows
        int col = sc.nextInt(); //initializing the column
        //taking the matrix1 to store the elements
        int Matrix1[][] = new int[rows][col];   
        int Matrix2[][] = new int[rows][col];
        int sub[][] =new int[rows][col];  //sub that stores the values
        System.out.println("Enter the Matrix1 elements:");
        //loop that takes the rows elements of matrix1
        for(int i=0;i<rows;i++)   
        {
            for(int j=0;j<col;j++)
            {
               Matrix1[i][j] = sc.nextInt();   //reads the matrix1 values
            }
        }
        System.out.println("Enter the Matrix2 elements:");
        //loop that checks the column elements of matrix2
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                Matrix2[i][j] = sc.nextInt();  //reads the matrix2 values
            }
        }
        //loops that checks the subtraction operation of two matrices
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                sub[i][j] = Matrix1[i][j]-Matrix2[i][j];
            }
        }
        System.out.println("Sub of two matrix is:");
        //prints the result
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }
        sc.close(); //scanner close

        
        
    }
    
}
