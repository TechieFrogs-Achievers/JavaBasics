package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram32 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner scan = new Scanner(System.in);    // scanner class
        int rows = scan.nextInt();    //  taking rows and column elements 
        int columns = scan.nextInt();
        System.out.println("Enter the elements");
        int matrix[][] = new int[rows][columns];   //  array for storing the elements
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                matrix[i][j] = scan.nextInt();    // Reading the input elements in matrix
            }
        }
        int evenNbrs = 0, oddNbrs = 0;
        
        for(int i = 0; i < rows; i++)     //loop for checking even numbers 
        {
            for(int j = 0; j < columns; j++)     // loop for checking odd numbers
            {
                
                if(matrix[i][j] % 2 == 0)    // checking even number
                {
                    
                    evenNbrs++;     // increase even number
                }
                
                else if(matrix[i][j] != 0)     //checking for odd numbers
                {
                    
                    oddNbrs++;
                }
            }
        }
        
        System.out.println("The frequency of even numbers is : " +evenNbrs);     // printing  even & odd numbers
        System.out.println("The frequency of odd numbers is : " +oddNbrs);
        scan.close();       
        
    }
    
}
