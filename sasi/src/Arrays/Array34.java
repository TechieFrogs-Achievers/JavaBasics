package Arrays;

import java.util.Scanner;

public class Array34 
{
    public static void main(String[] args)
     {
         System.out.println("Enter the elements:");
         Scanner sc = new Scanner(System.in);  //scanner class object
         int rows=sc.nextInt();   //initializing the row elements
         int columns = sc.nextInt(); //initializing the column elements
         int arr[][] = new int[rows][columns]; //array that stores elements
         for(int i=0;i<rows;i++)
         {
             for(int j=0;j<columns;j++)
             {
                arr[i][j] = sc.nextInt(); //reads the elements
             }
         }
         for(int i=0;i<rows;i++)
         {
             int sumrow = 0;
             for(int j=0;j<columns;j++)
             {
                 sumrow = sumrow+arr[i][j];   //adds the row elements
             }
             System.out.println("sum of "+(i+1)+"rows:"+sumrow); //prints the row elements
         }
         //loop that checks the column elements
         for(int i=0;i<columns;i++)
         {
             int sumcolumn =0;
             for(int j=0;j<rows;j++)
             {
                 sumcolumn = sumcolumn+arr[j][i];  //adds the column elements with the array 
             }
             System.out.println("sum of+"+(i+1)+"column:"+sumcolumn); //prints the column elements
         }
        sc.close();   //scanner close
    }
    
}
