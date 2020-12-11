package Arrays;

public class ArrayExample37 
{
    public static void main(String[] args) 
    {
        int arr1[][] = {{1,1,1},{2,2,2},{3,3,3}};
        int arr2[][] = {{1,2,3},{4,5,6},{1,2,3}};
        int arr[][] = new int[3][3];
        //add the two matrices
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j ++ )
            {
                arr[i][j] = arr1[i][j] * arr2[i][j] ;
            }
        }
        //print the array
        System.out.println("Multipulcation of matrix is:");
        for(int i = 0; i < 3 ; i++)
        {
            for( int j = 0; j < 3 ; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
