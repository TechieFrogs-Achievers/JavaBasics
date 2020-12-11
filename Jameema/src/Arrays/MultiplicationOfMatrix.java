package Arrays;

import java.util.Scanner;

public class MultiplicationOfMatrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  //scanner class
        int length = sc.nextInt(); //input length
        int [][] mat1 = new int[length][length]; //first matrix values
        int [][] mat2 =new int[length][length]; //second matrix values
        int [][] result =new int[length][length]; //for storing the data
        for(int i=0;i<length;i++) 
        {
            for(int j=0;j<length;j++) //for reading input values
            {
                mat1[i][j]=sc.nextInt(); //matrix1
            }
            
        }
        for(int i=0;i<length;i++) 
        {
            for(int j=0;j<length;j++) //for reading input values
            {
                mat2[i][j]=sc.nextInt(); //matrix2
            }
            
        }


        System.out.println("multiplication matrix");
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length;j++)
            {
                result[i][j]=0; //initilaize the matrix
                for(int k=0;k<length;k++) 
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
