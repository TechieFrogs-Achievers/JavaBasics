package ArrayPrograms;

import java.util.Scanner;

public class TransposeP25 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3]; //matrix initialization
        int transpose[][] = new int[3][3];//matrix initialization

        System.out.println("enter array elements ");

        for(int i = 0 ;i <3 ; i++)
        {
            for(int j =0 ; j <3; j++)
            {
                matrix[i][j] = sc.nextInt();//taking  input from keyboard
            }
        } 
        System.out.println("matrix : ");

    for(int i = 0; i < 3 ;i++)
    {
         for(int j =0; j <3 ; j++)
         {
             System.out.print(matrix[i][j] + " "); //printing matrix 
         }

         System.out.println();
    } 

    System.out.println("transpose matrix");

    for(int i = 0; i < 3; i ++)
    {
        for(int j =0 ; j<3; j++)
        {
           
             transpose[i][j] = matrix[j][i]; //elements in matrix one are giving to matrix 2
        }
    } 
    //loops for printing matrices
   for(int i = 0; i < 3 ;i++)
    {
         for(int j =0; j <3 ; j++)
         {
             System.out.print(transpose[i][j] + " ");
         }

         System.out.println();
    } 
       sc.close(); 
    }
    
}
