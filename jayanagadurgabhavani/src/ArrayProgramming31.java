public class ArrayProgramming31 
{
    public static void main(String[] args)
     {
        int rows, cols,size,count=0;
        int a[][]={
            {1,2,3},
            {3,4,5},
            {4,5,6}
                  };    
          rows = a.length;    //Calculates number of rows and columns present in given matrix 
          cols = a[0].length;       
          size = rows * cols;   //Calculates the size of array      
          for(int i = 0; i < rows; i++)//Count all zero element present in matrix 
           {    
              for(int j = 0; j < cols; j++)
               {    
                  if(a[i][j] == 0)    
                      count++;    
                }    
            }    
                  
          if(count > (size/2))    
              System.out.println("Given matrix is a sparse matrix");    
          else    
              System.out.println("Given matrix is not a sparse matrix");    
      }    
    
}
