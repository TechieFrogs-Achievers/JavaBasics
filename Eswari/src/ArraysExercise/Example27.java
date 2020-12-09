package ArraysExercise;

import java.util.Scanner;

//class to determine whether a given matrix is identity matrix or not
public class Example27 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for taking input from user
        //taking rows and columns size from user
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        //creating matrix with row and columns size
        int matrix[][] = new int[rows][columns];
        //loops for reading matrix elements from console
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                //reading matrix elements
                matrix[i][j] = scan.nextInt();
            }
        }
        int flag = 1;
        //if amtrix is identity matrix then that matrix has rows size and columns size is equal 
        if(rows == columns)
        {
            //loops for taking one one element from matrix
            for(int i = 0; i < rows; i++)
            {
                for(int j = 0; j < columns; j++)
                {
                    //checking diagonal of a matrix is 1 or not 
                    if(i == j && matrix[i][j] != 1)
                    {
                        flag = 0;

                    }
                    //checking non diagonal of a matrix is 0 or not
                    if(i != j && matrix[i][j] !=0)
                    {
                        flag = 0;
                    }
                }
            }
            //if true then it prints identity matrix
            if(flag == 1)
            {
                System.out.println("The given matrix is identity matrix");
            }
            //it prints not a identity matrix
            else
            {
                System.out.println("The given matrix is not an identity matrix");
            }
        }
        //if rows and columns are not equal then this else excuted
        else
        {
            System.out.println("The matrix is not an identity matrix");
        }
        scan.close();               //scanner close
    }
    
}
