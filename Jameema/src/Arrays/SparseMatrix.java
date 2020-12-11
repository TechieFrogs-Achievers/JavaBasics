package Arrays;

import java.util.Scanner;

public class SparseMatrix 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class 
        
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int matrix[][] = new int[rows][columns];
        int noOfZeros =0, non_Zeros = 0;            //initially take zeros and non-zeros as 0
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                
                matrix[i][j] = scan.nextInt();  //readding matrix elements
            }
        }
        
        for(int i =0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                
                if(matrix[i][j] == 0) //checks the elements are 0
                {
                    
                    noOfZeros++;
                }
                
                else //if element is  not 0 
                {
                    non_Zeros++;
                }
            }
        }
        
        if(noOfZeros > non_Zeros) //checking matrix elements
        {
            System.out.println("The given matrix is spsrse matrix");
        }
        else
        {
            System.out.println("The given matrix is not a sparse matrix");
        }
        scan.close();               
        
    }
    
}
