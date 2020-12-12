package Arrays;

import java.util.Scanner;

public class Array38Sparse
 {
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        //taking rows and columns size from user
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        //declaring matrix
        int matrix[][] = new int[rows][columns];
        int noOfZeros =0, non_Zeros = 0;            //initially take zeros and non-zeros as 0
        //loops for reading matrix elements
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                //readding matrix elements
                matrix[i][j] = scan.nextInt();
            }
        }
        //loops for checking sparse matrix or not
        for(int i =0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                //checking the element in an matrix is 0 or not(if it is 0 then it enters into execution)
                if(matrix[i][j] == 0)
                {
                    //if it is 0 then it is incremented
                    noOfZeros++;
                }
                //if the element is not zero then else block is executed
                else
                {
                    non_Zeros++;
                }
            }
        }
        //if zeros are greater than non zeros then it is sparse matrix
        if(noOfZeros > non_Zeros)
        {
            System.out.println("The given matrix is spsrse matrix");
        }
        else
        {
            System.out.println("The given matrix is not a sparse matrix");
        }
        scan.close();               //scanner close
    }
}
