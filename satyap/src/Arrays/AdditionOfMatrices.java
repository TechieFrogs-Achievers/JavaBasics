package Arrays;
import java.util.*;
public class AdditionOfMatrices  // class for printing addition of two matrices
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // scanner class
        int length=sc.nextInt();
        int arr1[][]=new int[length][length];// array notations
        int arr2[][]=new int[length][length];
        for(int i=0;i<arr1.length;i++) //for loop for storing array elements
        {
            for(int j=0;j<arr1.length;j++)
            {
               arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr2.length;i++) //for loop for stroing array 2 elements in array
        {
            for(int j=0;j<arr2.length;j++)
            {
               arr2[i][j]=sc.nextInt();
            }
        }
        int add[][]=new int[length][length];
        for(int i=0;i<arr2.length;i++) // for loop for adding of two arrays
        {
            for(int j=0;j<arr2.length;j++)
            {
                add[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<arr2.length;i++) // for loop for printing the add array
        {
            for(int j=0;j<arr2.length;j++)
            {
                System.out.print(add[i][j]+" ");
            }
        }
        sc.close(); // scanner close
        
    }
}
