import java.util.Scanner;
public class Array44 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int m = sc.nextInt(5);
        int n = sc.nextInt(5);
        System.out.println("Enter array elements : ");
        int[][] arr = new int[m][n] ;
        for(int i = 0 ; i < m ; i++ )
        {
            for( int j = 0 ; j < n ;  j++ )
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < m ; i++ )
        {
            for(int j = 0 ; j < n ; j++ )
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transpose = new int[n][m] ; 
        for(int i = 0; i < n ; i++ )
        {
            for(int j = 0; j < m; i ++ )
            {
                transpose[i][j] = arr[j][i] ;
            }
        }
        for(int i = 0 ; i < n ; i++ )
        {
            for(int j = 0; j < m ; j++ )
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }   
}
