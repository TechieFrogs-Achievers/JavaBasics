package Arrays;

import java.util.Scanner;

public class ArrayExample28 
{
    public static void main(String[] args) 
    {
        int a[][]= new int[3][3];
        int i,j,zero=0;
         //scanner class
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

        for(i=0;i<3;i++)//check zero's in matrix
        {
            for(j=0;j<3;j++)
            { 
                if(a[i][j]==0)
                 zero=zero+1;
            }
        }
        if(zero>3*3/2)//check condition for sparce
             System.out.println("Mtrix is Sparce:");
        else
            System.out.println("Mtrix is not  Sparce:");
    }
}
