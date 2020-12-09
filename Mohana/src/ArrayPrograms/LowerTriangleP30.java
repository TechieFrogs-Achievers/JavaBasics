package ArrayPrograms;

import java.util.Scanner;

public class LowerTriangleP30 
{
    public static void main(String[] args)
    {
        int [][]a=new int[3][3];
        Scanner scan=new Scanner(System.in);
        int rows=a.length;//counting no of rows
        int column=a[0].length;//counting no of coloumns
        System.out.println("enter the array elemnts");

         //initializing an array 
         for(int i=0; i<a.length; i++)
         {
            for(int j=0; j<a.length; j++)
            {
                a[i][j]=scan.nextInt();
            }
        }
        scan.close();
        
    if(rows!=column)//checking rows and coloumns are equal or not
    {
        System.out.println("the matrix should be a aquare matrix");
    }
    
    else
    {
        System.out.println("the upper matrix is");
     for(int i=0; i<a.length; i++)
     {
            for(int j=0; j<a.length; j++)
            {
                if(i<j) //if row index values less  than coloumn,print '0'at that position
                {

                 System.out.print("0"+" ");
                }

                 else //if not print value at that position
                 {
                     System.out.print(a[i][j]+" ");
                 }
             }
            System.out.println();
        }
        
    }
    
}  

}
