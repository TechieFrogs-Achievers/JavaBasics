package Arrays;
import java.util.*;
public class ArrayExample30 
{
    public static void main(String[] args) 
    {
        int rows,cols,i,j;    
        boolean flag = true; 
        int a[][]= new int[3][3]; 
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for(i=0;i<3;i++)//enter the elements into an array
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter number in ["+i+"]["+j+"]");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is........");
        for(i=0;i<3;i++)//print the matrix
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
        }
        //Calculates number of rows and columns present in given matrix    
        rows = a.length;    
        cols = a[0].length;    
          
        if(rows != cols){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else {    
            //Performs required operation to convert given matrix into lower triangular matrix    
            System.out.println("Lower triangular matrix: ");    
            for( i = 0; i < rows; i++)
            {    
                for( j = 0; j < cols; j++)
                {    
                  if(j > i)    
                    System.out.print("0 ");    
                  else    
                    System.out.print(a[i][j] + " ");    
              }    
              System.out.println();    
          }
              
    }
}
}