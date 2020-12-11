package Arrays;

import java.util.Scanner;

public class AddMultidimensional 
{
    public static void main(String[] args) 
    {
        //taking rows and columns are different
        Scanner sc = new Scanner(System.in);  //scanner class
        int rows = sc.nextInt(); //input length
        int columns = sc.nextInt();
        int [][] mat1 = new int[rows][columns]; //first matrix values
        int [][] mat2 =new int[rows][columns]; //second matrix values
        int [][] result =new int[rows][columns];
        for(int i=0;i<rows;i++) 
        {
            for(int j=0;j<columns;j++) //for reading input values
            {
                mat1[i][j]=sc.nextInt(); //matrix1
            }
            
        }
        for(int i=0;i<rows;i++) 
        {
            for(int j=0;j<columns;j++) //for reading input values
            {
                mat2[i][j]=sc.nextInt(); //matrix2
            }
            
        }


        System.out.println("adding matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                result[i][j]=mat1[i][j]+mat2[i][j]; //adding two matrices matrax
               System.out.print( result[i][j] + " "); //printing the final matric matrix
            }
            System.out.println();
            
        }
        sc.close();
        
    }
    
}
