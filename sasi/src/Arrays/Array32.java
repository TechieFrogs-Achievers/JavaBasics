package Arrays;

import java.util.Scanner;

public class Array32 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        //taking rows and columns size from user
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        //creating matrix
        int matrix[][] = new int[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }
        int evenNbrs = 0, oddNbrs = 0;
        //loop for checking even numbers and odd numbers in an matrix
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                //checking for even numbers
                if(matrix[i][j] % 2 == 0)
                {
                    //if it is even nbr then it increments
                    evenNbrs++;
                }
                //checking for odd numbers
                else if(matrix[i][j] != 0)
                {
                    //if it is odd number then it is incremented
                    oddNbrs++;
                }
            }
        }
        //printing there frquencies
        System.out.println("The frequency of even numbers is : " +evenNbrs);
        System.out.println("The frequency of odd numbers is : " +oddNbrs);
        scan.close();           //scanner close
    }
}
