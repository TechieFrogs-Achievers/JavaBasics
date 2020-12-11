package Arrays;
import java.util.*;
public class ProductOfMatrices //class for printing product of two matrices
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//scanner class
        int length=sc.nextInt();
        int arr1[][]=new int[length][length];// array notations
        int arr2[][]=new int[length][length];
        for(int i=0;i<arr1.length;i++)// for loop for array stroing
        {
            for(int j=0;j<arr1.length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        } 
        for(int i=0;i<arr2.length;i++)// for loop for array 2 stroing elements
        {
            for(int j=0;j<arr2.length;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        } 
        int arr3[][]=new int[length][length]; // array 3 for storing product values
        
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                 arr3[i][j]=0;
               for(int k=0;k<length;k++)
               {
                  arr3[i][j]+=arr1[i][k]*arr2[k][j]; // product of two matrices formula
               }
               System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        sc.close(); // scanner close
    }
}
