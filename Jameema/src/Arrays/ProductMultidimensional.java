package Arrays;

import java.util.Scanner;

public class ProductMultidimensional 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  //scanner class
        int rows = sc.nextInt(); //input length
        int columns = sc.nextInt();
        int [][] mat1 = new int[rows][columns]; //first matrix values
        int [][] mat2 =new int[rows][columns]; //second matrix values
        int [][] result =new int[rows][columns]; //for storing the data
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


        System.out.println("multiplication matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                result[i][j]=0; //initilaize the matrix
                for(int k=0;k<columns;k++) 
                {
                    result[i][j]= result[i][j]+mat1[i][k]*mat2[k][j]; //multiplicating two matrices 
                    
                }
                System.out.print( result[i][j] + " "); //printing the final  matrix
            }

            System.out.println();
            
        }
        sc.close(); 
        
    }
    
}
