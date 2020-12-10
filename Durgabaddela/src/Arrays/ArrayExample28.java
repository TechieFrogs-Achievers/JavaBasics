import java.util.Scanner;

public class ArrayExample28 
{
    public static void main(String[] args)
    {
        int zeros = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the matrix: ");
        int rows = sc.nextInt();//taking rows from keyboard
        int columns = sc.nextInt();//taking column from keyboard
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix ");
        for (int i = 0; i < rows; i++)
         {
            for (int j = 0; j < columns; j++) 
            {
                matrix[i][j] = sc.nextInt();
            
            }
        }
        System.out.println("the given matrix is");
        for (int i = 0; i < rows; i++)
         {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < rows; i++)
         {
            for (int j = 0; j < columns; j++) 
            {
                if (matrix[i][j] == 0) //checking if the elements are equal
                {
                    zeros++;//zeros count increases
                }
            }
        }

        if (zeros > (rows * columns) / 2)//condition for sparse matrinx
        {
            System.out.println("this is a sparse matrix");
        }
        else
        {
            System.out.println("This is not a sparse matrix");
        }
        sc.close();
 
    }
}
