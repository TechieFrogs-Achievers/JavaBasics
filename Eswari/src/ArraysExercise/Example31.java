package ArraysExercise;

import java.util.Scanner;

//class to display upper trianguar matrix
public class Example31 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int rows = scan.nextInt();                          //taking rows number from user
        int columns = scan.nextInt();                         //taking columns number of a matrix 
        int matrix[][] = new int[rows][columns];                //creating matrix

        //loop for reading matrix from console
        for(int i = 0; i < rows; i++)
        {
            for(int j =0; j < columns; j++)
            {
                //reading matrix elements
                matrix[i][j] = scan.nextInt();
            }
        }

        //loops for printing upper triangular matrix
        System.out.println("Lower Triangular matrix : ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                //if rows number greater than columns number then it is set to '0'
                if(i > j)
                {
                    //setting 0 fro that position
                    System.out.print("0" +" ");
                }
                //otherwise print matrix elements
                else
                {
                    System.out.print(matrix[i][j] +" ");
                }
            }
            System.out.println();
        }
        scan.close();           //scanner close
    }
}
