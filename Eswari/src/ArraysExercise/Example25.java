package ArraysExercise;

import java.util.Scanner;

//class to display transpose of a matrix
public class Example25 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int rows = scan.nextInt();                          //taking rows number from user
        int columns = scan.nextInt();                       //taking columns number from user
        int matrix[][] = new int[rows][columns];            //creating matrix

        //loops for reading matrix
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns;j++)
            {
                //reading matrix from console
                matrix[i][j] = scan.nextInt();
            }
        }
        //loops for printing transpose matrix 
        System.out.println("The transpose of a matrix is : ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                //printing transpose matrix 
                System.out.print(matrix[j][i] +" ");
            }
            System.out.println();
        }
        scan.close();                   //scanner close
    }
}
