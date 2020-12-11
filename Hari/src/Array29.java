import java.util.Scanner;
public class Array29 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0 ;
        System.out.println("Enter matrix size : ");
        int m =  sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter first matrix elements : ");
        int arr1[][] = new int[m][n];
        for(int i = 0 ; i< m ; i++)
        {
            for(int j = 0 ; j< n ; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Enter second matrix elements : ");
        int arr2[][] = new int[m][n];
        for(int i = 0; i< m ;i++)
        {
            for(int j = 0 ;j<n ;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i< m ; i++)
        {
            for(int j = 0; j<n ; j++)
            {
                if(arr1[i][j] == arr2[i][j])
                {
                    count++ ;
                }
            }
        }
        if(count == m*n)
        {
            System.out.println("Given matrices are equal");
        }
        else 
        {
            System.out.println("Given matrices are not equal");
        }
        sc.close();
    }   
}
