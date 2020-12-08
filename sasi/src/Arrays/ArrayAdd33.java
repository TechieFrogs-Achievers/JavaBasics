package Arrays;

import java.util.Scanner;

public class ArrayAdd33
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in); //input user
        int n=sc.nextInt(); //read elem
        int arr[][]=new int[n][n]; //arr for row
        int arr1[][]=new int[n][n]; // arr for clom
        for(int i=0;i<arr.length;i++) //loop for row arr
        {
            for(int j=0;j<arr.length;j++) 
            {
                arr[i][j]=sc.nextInt(); //read the  first arr elem
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                arr1[i][j]=sc.nextInt(); //read the second arr elem
            }
        }
        int add[][]=new int[n][n]; //store into an arr
        {
            for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                add[i][j]=arr[i][j]+arr1[i][j]; // adding an array
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                System.out.println(add[i][j]+" ");
            }
        }
        sc.close();
    }
    }
}
