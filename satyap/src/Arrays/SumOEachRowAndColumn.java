package Arrays;
import java.util.*;
public class SumOEachRowAndColumn  // class to print sum of rows elements and column elements in an array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class
        int rows=sc.nextInt(); //array notation
        int columns=sc.nextInt();
        int arr[][]=new int[rows][columns];
        for(int i=0;i<rows;i++)//for loop for storing array elements
        {
            for(int j=0;j<columns;j++)
            {
               arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<rows;i++)// for loop for sum elements of rows
        {
            int sumRow=0;
          for(int j=0;j<columns;j++)
          {
              sumRow=sumRow+arr[i][j];
          }
          System.out.println("Sum of"+(i+1)+"row:"+sumRow);
        }
        for(int i=0;i<columns;i++)//for loop for sum elements of columns
        {
            int sumColumn=0;
          for(int j=0;j<rows;j++)
          {
              sumColumn=sumColumn+arr[j][i];
          }
          System.out.println("Sum of"+(i+1)+"column:"+sumColumn);
        }
        sc.close();//scanner close
    }
}
