package Arrays;
import java.util.*;
public class MutiplyOfTwoMatricesFunction 
{
    int row1=2,row2=3,col1=3,col2=3;
    int arr1[][]=new int[row1][col1];
    int arr2[][]=new int[row2][col2];
    public void multiply(int arr1[][],int arr2[][])
    {
        //int product[][]=new int[row1][col2];
       int product[][]=multiply(arr1,arr2,row1,col1,row2,col2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int arr1[][]=new int[row1][col1];
        int arr2[][]=new int[row2][col2];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
               arr2[i][j]=sc.nextInt();
            }
        }
        
        
    }
}
