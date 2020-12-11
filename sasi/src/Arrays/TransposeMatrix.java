package Arrays;

import java.util.Scanner;

//import sun.tools.jar.resources.jar;

public class TransposeMatrix
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //input user
        int n=sc.nextInt(); //read elem
        int arr[][]=new int[n][n]; //arr for row and colm
      //  int arr1[][]=new int[n][n]; // arr for clom
        for(int i=0;i<arr.length;i++) //loop for row arr
        {
            for(int j=0;j<arr.length;j++) //col loop
                arr[i][j]=sc.nextInt(); //read the  arr elem
            }
            int transpose[][]=new int[n][n];
        for(int i=0;i<arr.length;i++) //loop for transpose row
        {
            for(int j=0;j<arr.length;j++)//loop  for transpose col
            {
                transpose[i][j]=arr[j][i]; //transpose row and col
            }
        }
       // transpose[i][j]=arr[n][n]; //store into an arr
        {
            for(int i=0;i<arr.length;i++) //transpose  of row and col print
        { 
            for(int j=0;j<arr.length;j++)
            {
              System.out.print(transpose[i][j]+" ");
            }
        }
        }
        sc.close();
    }
 }
