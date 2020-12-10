package Arrays;
//import java.util.*;
public class ArrayExample26 
{
    public static void main(String[] args) 
    {
        int arr1[][] = {{4,5,6},{7,8,9},{2,5,8}};
        int arr2[][] = {{1,2,3},{4,5,6},{1,2,3}};
        int arr[][] = new int[3][3];
        //subtract the two matrices
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j ++ )
            {
                arr[i][j] = arr1[i][j] - arr2[i][j] ;
            }
        }
        //print the array
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
