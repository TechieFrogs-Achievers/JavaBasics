package ArraysExercise;

import java.util.Scanner;

//class to print sum of each row and each column of a matrix
public class Example34 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int rows = scan.nextInt();                  //taking rows number of a matrix from user
        int columns = scan.nextInt();                   //taking rows number of a matrix from user
        int matrix[][] = new int[rows][columns];            //creating matrix
        int sum,colSum;                     //initialize the sum and colSum

        //loops for reading matrix elements from console
        for(int i= 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                //reading matrix elements 
                matrix[i][j] = scan.nextInt();
            }
        }

        //loops for adding rows elements and columns elements of a matrix
        for(int i = 0; i < rows; i++)
        {
            sum = 0;
            colSum = 0;
            for(int j = 0; j < columns; j++)
            {
                //rows sum formula
                sum = sum +matrix[i][j];
                //columns sum formula
                colSum =colSum + matrix[j][i];
            }
            //printing sum of rows and columns 
            System.out.println("The sum of " +i +" "+"row is : " +sum);
            System.out.println("The sum of " +i +" " +"column is :" +colSum);
            System.out.println();
        }
        scan.close();               //scanner close
    }
    
}
