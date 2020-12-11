import java.util.Scanner;
public class Array28 
{
    public static void main(String[] args)
    {
        int count = 0;    // number of zeros in matrix
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix : ");
        // instatiating size of matrix
        int m = sc.nextInt();   
        int n = sc.nextInt();
        // instantiating elements of an array
        System.out.println("Enter array array elements : ");
        int arr[][] = new int [m][n] ; 
        for(int i = 0 ; i< m ; i++)
        {
            for(int j = 0; j< n ; j++)
            {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 0)
                {
                    count++ ;
                }
            }
        }
        if(count > (m*n)/2)
        {
            System.out.println("Given matrix is sparse matrix");
        }
        else 
        {
            System.out.println("Given matrix is not a sparse matrix");
        }
        sc.close();
    }   
}
