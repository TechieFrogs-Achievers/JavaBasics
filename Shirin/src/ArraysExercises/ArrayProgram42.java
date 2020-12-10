package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram42 
{
    //...... using multi dimensional array....//
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);  //scanner class
        int rows = sc.nextInt();    // taking row elements
        int columns= sc.nextInt();
        int marr1[][] = new int[rows][columns];   //array for  first matrix data
        int marr2[][] = new int[rows][columns];    //array for  second matrix data
        
        System.out.println(" enter the first matrix ");
        for(int i =0 ; i <  rows; i++ )    //loop for checking the first matrix (row elements) 
        {
            for(int j =0; j < columns; j++)    //column
            {
                marr1[i][j] = sc.nextInt();   //reading the elements   
            }
        }
        System.out.println("Enter the second matrix");
        for(int i = 0; i < rows; i++)    //loop for checking the second matrix(row elements) 
        {
            for(int j =0; j < columns; j++)  // column
            {
                marr2[i][j] = sc.nextInt();
            }
        } 
            int marr3[][] = new int[rows][columns];    // creating another matrix to store the data of two matrices
            System.out.println(" multiply of two matrices are :");
            for(int i = 0; i < marr3.length; i++)   // loop for checking the first matrix 
            {
                for(int j =0 ; j < marr3.length; j++)   // loop for checking the second matrix
                {
                    marr3[i][j] =0;
                
                    for(int k =0; k < marr3.length; k++)
                    {
                        marr3[i][j]+= marr1[i][k]*marr2[k][j];  // condition for multiplying the two matrices
                    }
                    System.out.print(marr3[i][j]+ " ");
                  
                }
                System.out.println();
            }
              sc.close();   // scanner class close
        
    }
    
}
