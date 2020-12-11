import java.util.*;
public class ArraysEx27 
{
     public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);        //create scanner class object

        /* System.out.println("Enter no.of rows and cloumns");

        int m = sc.nextInt();
        int n = sc.nextInt(); */
        
        int arr[][] = {{1,0,0},{0,1,0},{0,0,1}};        //identity matrix
        int arr1[][] = new int[3][3];                   //create a matrix to store the entered values

        System.out.println("Enter 9 integer elements");
        for(int i = 0 ; i < 3 ; i++)            //loop to get values from user
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
            
        }

        System.out.println("your matrix is ");
        for(int i = 0 ; i < 3 ; i++)                //loop to print the entered matrix
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println();
        }

        int count = 0;

        //loop to  check the two matrices

        for(int i = 0 ; i < 3; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                if(arr[i][j] == arr1[i][j])     //checking the elements
                {
                    count++;
                }
            }
        }

        //condition to check identity matrix or not

        if(count == 9)
        {
            System.out.println("The given matrix is an identity matrix");
        }
        else
        {
            System.out.println("The given matrix is not an identity matrix");
        }

     sc.close();  
    }
}
