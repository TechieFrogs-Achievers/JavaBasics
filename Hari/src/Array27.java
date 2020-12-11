import java.util.Scanner;
public class Array27 
{
    public static void main(String args[])   
    {
        int count = 0 , cnt = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size : ");
        int m = sc.nextInt();                           // instantiating size of the matrix
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr[][] = new int[m][n] ;     // instantiating elements of matrix
        for(int i = 0 ; i < m ; i++ )
        {
            for(int j = 0 ; j < n ; j++ )
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(arr[i][j] + " ");     // printing the input matrix
            }
            System.out.println();
        }
        if(m != n)
        {
            System.out.println("Given matrix is not an identity matrix");
        }
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                if(i == j && arr[i][j] == 1)       // checking condition for identity.
                {
                    count++ ;
                }
                if(i != j && arr[i][j] == 0)
                {
                    cnt++ ;
                }
            }
        }
        if(count == m && cnt == n)
        {
            System.out.println("Given matrix is identity matrix");
        }
        else 
        {
            System.out.println("Given matrix is not an identity matrix");
        }
        sc.close();
    }
}
