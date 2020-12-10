package Arrays;
import java.util.*;
public class SubtractTwoMatrices  // class for printing subtraction of two arrays
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class
        int length=sc.nextInt();
        int arr1[][]=new int[length][length]; //arrays notations
        int arr2[][]=new int[length][length];
        for(int i=0;i<arr1.length;i++) //for loop for storing array elements 
        {
            for(int j=0;j<arr1.length;j++)
            {
              arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr2.length;i++)//for loop for stroing array 2 elements
        {
            for(int j=0;j<arr2.length;j++)
            {
              arr2[i][j]=sc.nextInt();
            }
        }
        int diff[][]=new int[length][length]; //var for  diff array notation 
        for(int i=0;i<arr1.length;i++) // for loop for diff or subtraction elements in an array
        {
            for(int j=0;j<arr2.length;j++)
            {
               diff[i][j] =arr1[i][j]-arr2[i][j];
            }
        }
        for(int i=0;i<arr1.length;i++)//printing the subtraction elements in an array
        {
            for(int j=0;j<arr2.length;j++)
            {
                System.out.print(diff[i][j]+" ");
            }
        }
        sc.close();//scanner class
    }
}
