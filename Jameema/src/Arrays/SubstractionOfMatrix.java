package Arrays;

import java.util.Scanner;

public class SubstractionOfMatrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  //scanner class
        int length = sc.nextInt(); //input length
        int [][] mat1 = new int[length][length]; //first matrix values
        int [][] mat2 =new int[length][length]; //second matrix values
        int [][] result =new int[length][length];
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


        System.out.println("substraction matrix");
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length;j++)
            {
                result[i][j]=mat1[i][j]-mat2[i][j]; //substracting two matrices matrax
               System.out.print( result[i][j] + " "); //printing the final matric matrix
            }
            System.out.println();
            
        }
        sc.close();
        
    }
    
}
