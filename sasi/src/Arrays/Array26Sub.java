package Arrays;

import java.util.Scanner;

public class Array26Sub
 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in); //input arr
        int n=sc.nextInt(); //read an elem
        int arr[][]=new int[n][n]; //arr for first 
        int arr1[][]=new int[n][n]; //arr for second
        for(int i=0;i<arr.length;i++)  //loop for 1st arr row
        {
            for(int j=0;j<arr.length;j++)//loop for colm
            {
                arr[i][j]=sc.nextInt(); //read an elem
            }
        }
        for(int i=0;i<arr1.length;i++) //loop for sec arr row
        {
            for(int j=0;j<arr1.length;j++) // loop for colm
            {
                arr1[i][j]=sc.nextInt();//read an elem
            }
        }
        int sub[][]=new int[n][n]; //store an arr
        {
            for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                sub[i][j]=arr[i][j]-arr1[i][j]; // substract of two array
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                System.out.println(sub[i][j]+" ");
            }
        }
        sc.close();
    }

    }
}
