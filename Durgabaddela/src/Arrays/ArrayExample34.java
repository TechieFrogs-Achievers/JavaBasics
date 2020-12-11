import java.util.Scanner;

public class ArrayExample34 
{
    public static void main(String[] args)
    {
        int sum =0;
        System.out.println("enter the number of rows and columns");
       Scanner sc = new Scanner(System.in);
       int m = sc.nextInt();
       int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<m;i++)
        {
            for(int j=0; j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the array is");
        for(int i=0;i<m;i++)
        {
            for(int j=0; j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the sum of each row");
        for(int i=0;i<m;i++)
        {
            sum=0;
            for(int j=i+1; j<n;j++)
            {
                sum = sum+arr[i][j];
                
            }
        }
        
        System.out.println("the sum of each column");
        for(int i=0;i<n;++i)
        {
            sum=0;
            for(int j=i+1; j<m;++j)
            {
                sum = sum+arr[j][i];
                System.out.println(sum);
                n++;
            }
           
        }
       
        sc.close();
    }
}
