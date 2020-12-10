package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram37 
{
    //......multiplication of two matrix...//
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);      //scanner class
        int length = sc.nextInt();   //array length 
        int marr1[][] = new int[length][length];  //array for  first matrix data
        int marr2[][] = new int[length][length];    //array for  second matrix data
        
        System.out.println(" enter the first matrix ");
        for(int i =0 ; i < marr1.length; i++ )    //loop for checking the first matrix (row elements) 
        {
            for(int j =0; j < marr1.length; j++)   //column
            {
                marr1[i][j] = sc.nextInt();    //reading the elements   
            }
        }
        System.out.println("Enter the second matrix");
        for(int i = 0; i < marr2.length; i++)   //loop for checking the second matrix(row elements) 
        {
            for(int j =0; j < marr2.length; j++)  // column
            {
                marr2[i][j] = sc.nextInt();
            }
        } 
            int marr3[][] = new int[length][length];     // creating another matrix to store the data of two matrices
            System.out.println(" multiply of two matrices are :");
            for(int i = 0; i < marr3.length; i++)    // loop for checking the first matrix 
            {
                for(int j =0 ; j < marr3.length; j++)    // loop for checking the second matrix
                {
                    marr3[i][j] =0;
                
                    for(int k =0; k < marr3.length; k++)
                    {
                        marr3[i][j]+= marr1[i][k]*marr2[k][j];
                    }
                    System.out.print(marr3[i][j]+ " ");
                  
                }
                System.out.println();
            }
              sc.close();   // scanner class close
        
    }
    
}
