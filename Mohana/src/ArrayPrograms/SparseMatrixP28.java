package ArrayPrograms;

import java.util.Scanner;

public class SparseMatrixP28 
{
    public static void main(String[] args) 
    {  
       int count =0;
       int size = 9;
        int matrix[][] = new int[3][3];//creating a new matrix
        System.out.println("enter matrix ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i <3;i++)
        {
           for(int j= 0;j <3; j++)
           {
               matrix[i][j] = sc.nextInt();//taking input from keyboard
           }
        }
        System.out.println("given matrix : ");
        for(int i = 0 ; i <3;i++)
        {
           for(int j= 0;j <3; j++)
           { 
              System.out.print(matrix[i][j] + " "); //printing matrix
           }
           System.out.println();
        }

      for(int i =0; i<3; i++)
      {
         for(int j =0; j <3; j++)
         {
            if(matrix[i][j] == 0)//checking condition for sparse matrix
            {
               count++;
            }
         }
      }
      //if count value greater than size condition for sparse matrix
      if(count > (size/2))
      {
         System.out.println("given matrix  is sparse ");
      }
      else{
         System.out.println("not a sparse matrix");
      }

          
   sc.close();
        
    }
    
}
