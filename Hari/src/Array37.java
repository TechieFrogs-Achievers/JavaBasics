import java.util.Scanner;
public class Array37 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr1[][] = new int[m][n] ;
        int arr2[][] = new int[m][n] ;
        int arr3[][] = new int[m][n];
        System.out.println("Enter first array : ");
        for(int i =0 ; i < m ; i++)
        {
            for(int j =0 ; j < n ; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second array : ");
        for(int i =0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The two input arrays are : ");
        for(int i =0 ; i< m ; i++)
        {
            for(int j =0 ; j < n ; j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        for(int i =0 ; i< m ; i++)
        {
            for(int j =0 ; j < n ; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Product of two matrices : ");
        for(int i = 0 ; i < m ; i++ )
        {
            for(int j = 0 ; j < n ; j++)
            {
                arr3[i][j] = 0 ;
                for(int k = 0 ; k < m ; k++ )
                {
                    arr3[i][j] += arr1[i][k] * arr2[k][j] ;
                }
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }   
}
