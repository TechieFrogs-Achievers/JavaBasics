public class ArraysEx36 
{
 public static void main(String[] args) 
    {
       //initializing the the matrices
    
       int arr1[][] = {{1,2,3},{1,2,3},{1,2,3}};
       int arr2[][] = {{1,2,3},{1,2,3},{1,2,3}};

       int arr3[][] = new int[3][3];            //creating matrix to store the sum of matrices

       //loop to add the two matrices
      
       for(int i = 0 ; i < 3 ; i++)             
       {
           for(int j = 0 ; j < 3 ; j++)
           {
               arr3[i][j] = arr1[i][j] + arr2[i][j];          
               System.out.print(" "+arr3[i][j]);
           }
           System.out.println();
       }
    }
}
