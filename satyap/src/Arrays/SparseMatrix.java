package Arrays;
import java.util.*;
public class SparseMatrix 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        int count=0,size;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        size=rows*cols;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]==0)
                {
                    count++;
                }
            }
        }
        if(count>(size/2))
        {
            System.out.println("Given matrix is sparse matrix");
        }
        else{
            System.out.println("Given matrix is not sparse matrix");
        }
        sc.close();
    }
}
