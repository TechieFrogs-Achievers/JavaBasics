public class ArrayProgramming29 
{
    public static void main(String[] args) 
    {  
        int rows, cols;   
          int a[][] = {  
                          {4, 5, 6},  
                          {3, 4, 1},  
                          {1, 2, 3}  
                       };   
          int b[][] = {  
                          {2, 0, 3},  
                         {2, 3, 1},  
                         {1, 1, 1}  
                     };  
            rows = a.length;  //Calculates number of rows and columns present in given matrix  
            cols = a[0].length;  
          //Array diff will hold the result  
          int diff[][] = new int[rows][cols];  
  
          //Performs subtraction of matrices a and b. Store the result in matrix diff  
          for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
                diff[i][j] = a[i][j] - b[i][j];  
            }  
        }    
        for(int i = 0; i < rows; i++)
        {  
            for(int j = 0; j < cols; j++)
            {  
               System.out.print(diff[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}
