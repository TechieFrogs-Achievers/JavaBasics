import java.util.Scanner;
public class Array36 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int array1[][] = new int[m][n] ;
        int array2[][] = new int [m][n] ;
        int  array3[][] = new int[m][n] ;
        System.out.println("Enter first array : ");
        for(int i = 0 ; i < m ; i++)
        {
            for(int j =0 ; j < n ; j++)
            {
                array1[i][j] = sc.nextInt();
            }
        }   
        System.out.println("Enter second array : ");
        for(int i= 0 ; i < m ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The two strings are : ");
        for(int i = 0; i < m ; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(" " + array1[i][j]);
            }
            System.out.println();
        }
        for(int i = 0 ; i < m ; i++)
        {
            for(int j =0; j < n ; j++)
            {
                System.out.print(" "+ array2[i][j]);
            }
            System.out.println();
        }
        System.out.println(" The sum of two arrays are : ");
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                array3[i][j] = array1[i][j] + array2[i][j] ;
                //System.out.println( " " +array3[i][j]);
            }
        }
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(" "+array3[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }   
}
