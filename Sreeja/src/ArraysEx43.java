import java.util.*;
public class ArraysEx43 
{
   
    //method to multiply two arrays
    
    static void multiply( int arr[][] , int arr1[][] , int m, int n )
    {
        int mul[][] = new int[m][n];            //create matrix to store the elements

        for(int i = 0 ; i < m ; i++)
        {
            for(int j =  0 ; j < n ; j++)
            {
                for (int k = 0; k < 3; k++) 
                {
                  mul[i][j] = arr[i][k] * arr1[k][j];       //multilication of elemenets in two arrays
                }
            }
        }

        //loop to print the elements in multiplication array
        
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(" "+mul[i][j]);
            }
            System.out.println();
        }


    }
   
   
   
   
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);        //create scanner class object

        System.out.println("Enter rows");
         int m = sc.nextInt();          //read rows from user 

        System.out.println("Enter number coloumns");
         int n = sc.nextInt();              //read coloumns from user 

        //create matrices to store the elements entered from user
        
         int arr[][] = new int[m][n];
        int arr1[][] = new int[m][n];

        System.out.println("Enter "+m*n+"elements of 1st array");

        //loop to get valuse of first array
        
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println("Enter"+m*n+"elements of second array");

        //loop to get values of second array
        
        System.out.println("After multiplication of two arrays");
        
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        ArraysEx43.multiply(arr,arr1,m,n);      //method calling

        sc.close();






    }
}
