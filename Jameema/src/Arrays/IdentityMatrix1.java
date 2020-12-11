package Arrays;

import java.util.Scanner;

public class IdentityMatrix1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int matrix[][] = new int[rows][columns];  //input data
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                
                matrix[i][j] = scan.nextInt();  //reading matrix elements
            }
        }
        int flag = 1;
        
        if(rows == columns) //matrix is identity rows and columns are equal
        {
            
            for(int i = 0; i < rows; i++)
            {
                for(int j = 0; j < columns; j++)
                {
                    
                    if(i == j && matrix[i][j] != 1)  //checking diagonal is 1 or not 
                    {
                        flag = 0;

                    }
                    
                    if(i != j && matrix[i][j] !=0)   //checking non diagonal is 0 or not
                    {
                        flag = 0;
                    }
                }
            }
            
            if(flag == 1)
            {
                System.out.println("The given matrix is identity matrix");
            }
         
            else
            {
                System.out.println("The given matrix is not an identity matrix");
            }
        }
        
        else   //rows and columns are not equal
        {
            System.out.println("The matrix is not an identity matrix");
        }
        scan.close();             
        
    }
    
}
