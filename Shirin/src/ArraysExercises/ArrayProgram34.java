package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram34 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length:");
         Scanner sc = new Scanner(System.in);    //scanner class object
         int rows=sc.nextInt();     //initializing  row elements
         int columns = sc.nextInt();   //initializing  column elements
         System.out.println("Enter the elements");
         int arr[][] = new int[rows][columns]; //array for storing the elements
         for(int i=0;i<rows;i++)
         {
             for(int j=0;j<columns;j++)
             {
                arr[i][j] = sc.nextInt(); //reads the elements
             }
         }
         for(int i=0;i<rows;i++)   // loop for checking the row elements
         {
             int sumrow = 0;
             for(int j=0;j<columns;j++)
             {
                 sumrow = sumrow+arr[i][j];   //adding the row elements
             }
             System.out.println("sum of "+(i+1)+"rows:"+sumrow); //prints the row elements
         }
         
         for(int i=0;i<columns;i++)    // loop for checking the column elements
         {
             int sumcolumn =0;
             for(int j=0;j<rows;j++)
             {
                 sumcolumn = sumcolumn+arr[j][i];    //Adding  the column elements with the array 
             }
             System.out.println("sum of "+(i+1)+ "column:"+sumcolumn);   //prints the column elements
         }
        sc.close();   //scanner class close
    }
    
        
    
    
}
