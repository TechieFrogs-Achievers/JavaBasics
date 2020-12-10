package Arrays;
import java.util.*;
public class ArrayExample43 
{
    static void multiply(int arr1[][], int arr2[][])//creating a method with  two arrays as its parameters 
    {
        System.out.println("product of two matrices");
        int product[][] = new int[3][3];//another array creation with length
        for (int i = 0; i < 3; i++)
         {
            for (int j = 0; j < 3; j++) 
            {
                 product[i][j] = 0;
                for (int k = 0; k < 3; k++) 
                {
                    product[i][j] = arr1[i][k] * arr2[k][j];//multiplication of two matrices
                }

                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        //int[][] a = { { 2, 3, 5 }, { 3, 4, 3 },{3,4,6}};//array1 initilazation 
        //int[][] b = { { 4, 5, 2 }, { 4, 1, 9 },{3,6,2}};//array2 initilazation
        //int a[][]= new int[3][3]; 
        //int b[][]=new int[3][3];
        int i,j;
        Scanner sc=new Scanner(System.in);
        int a[][]= new int[3][3]; 
        int b[][]=new int[3][3];
        System.out.println("Enter matrix elements:");
        for(i=0;i<3;i++)//enter the elements into an array
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter number in ["+i+"]["+j+"]");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix elements:");
        for(i=0;i<3;i++)//enter the elements into an array
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter number in ["+i+"]["+j+"]");
                b[i][j]=sc.nextInt();
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
        System.out.println("Matrix is........");
        for(i=0;i<3;i++)//print the matrix
        {
            for(j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
                
            }
            System.out.println();
        }

        multiply(a, b);//passing two array elements into the method

    }
}
