import java.util.*;
public class ArraysEx31 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);            //create scanner class object

        System.out.println("Enter no of rows and coloumns");

        //read the rows and coloumns from user

        int m = sc.nextInt();
        int n = sc.nextInt();

        //create matrix to store entered elements 

        int arr[][] = new int[m][n];

        if(m==n)
        {

        System.out.println("enter elements "+(m*n)+"to matrix");

        //loop to get elements from user
        
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < m ;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
            //to print the upper triangular matrix
            
            for(int i = 0 ; i < m ; i++)
            {
                for(int j = 0 ; j < m ;j++)
                {
                    if(i>j)
                    {
                        System.out.print(" "+"0");
                    }

                    else
                    {
                        System.out.print(" "+arr[i][j]);
                    }
                    
                }
                System.out.println("");
            }
            
        }
        else
        {
            System.out.println("rows and coloumns must be same");
        }
        sc.close();
    }
}
