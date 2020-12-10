public class ArraysEx25 
{
   public static void main(String[] args) 
   {
       int arr[][] = {{1,2},{3,4}};             //create matrix

       int arr1[][] = new int[2][2];            //create another matrix to store transpose of matrix

       //loop to transpose the matrix
       
       for(int i = 0 ; i < 2 ; i++)
       {
           for(int j = 0 ; j < 2 ; j++)
           {
               arr1[i][j] = arr[j][i];
               System.out.print(" "+arr1[i][j]);        //print the matrix
           }
           System.out.println();

       }
   } 
}
