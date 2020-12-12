package Arrays;

import java.util.Scanner;

public class ArrayExample32 
{
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);//scanner class object
        int rows = scan.nextInt();
        int columns = scan.nextInt();  //initializing the columns
        //creating matrix to store the rows & columns
        int matrix[][] = new int[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }
        int evenNumbers = 0, oddNumbers = 0;
        //loops for checking even numbers and odd numbers in an matrix
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                //condition to check for even numbers
                if(matrix[i][j] % 2 == 0)
                {
                    
                    evenNumbers++;  //it increments if it is even
                }
                //checking for odd numbers
                else if(matrix[i][j] != 0)
                {
                    //if it is odd number then it is incremented
                    oddNumbers++;
                }
            }
        }
        
        System.out.println("The frequency of even numbers is : " +evenNumbers); //prints the result
        System.out.println("The frequency of odd numbers is : " +oddNumbers);
        scan.close();           //scanner close
        
    }
    
}
