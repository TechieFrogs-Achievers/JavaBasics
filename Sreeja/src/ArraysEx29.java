import java.util.*;
public class ArraysEx29 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);            //create scanner class object

        System.out.println("Enter no of rows and coloumns");

        //read the rows and coloumns from user

        int m = sc.nextInt();
        int n = sc.nextInt();

        //create matrices to store entered elements 

        int arr[][] = new int[m][n];
        int arr1[][] = new int[m][n];
       
        System.out.println("Enter"+" "+(m*n)+" "+"integer elements for first matrix");

        //loop to eneter elements in first matrix 
        
        for(int i=0;i<m;i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter"+" "+(m*n)+" "+"integer elements for second matrix");

        //loop to eneter elements in second matrix
       
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered elements in  irst matrix are");

        //print the first matrix
        
        for(int i = 0 ; i < m ; i ++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                System.out.print(" "+arr[i][j]);
            }
        }

        System.out.println("Entered elements in second matrix are");

        //print the second matrix
        
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.println(" "+arr1[i][j]);
            }
        }

        int count = 0;

        //checking the equality of elements in two matrices
        
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(arr[i][j] == arr1[i][j])
                {
                    count++;
                }
            }
        }

        //check the equality of two matrices

        if(count == (m*n))
        {
            System.out.println("Both matrices are equal");
        }
        else
        {
            System.out.println("Both matrices are not equal");
        }
        sc.close();

    }
}
