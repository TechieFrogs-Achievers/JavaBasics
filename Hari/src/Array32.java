import java.util.Scanner;
public class Array32 
{
    public static void main(String args[])
    {
        int even = 0 , odd = 0 ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix : ");
        // instatiating rows and columns 
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter matrix elements : ");
        // instatiating matrix elements
        int arr[][] = new int[m][n];
        for(int i = 0; i< m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        // display the input matrix
        for(int i = 0; i < m ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // calculating frequency of even and odd numbers
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(arr[i][j] % 2 == 0)
                {
                    even++ ;
                }
                else 
                {
                    odd++ ; 
                }
            }
        }
        System.out.println("Frequency of even numbers is : " + even);
        System.out.println("Frequency of odd numbers is : " + odd);
        sc.close();
    }   
}
