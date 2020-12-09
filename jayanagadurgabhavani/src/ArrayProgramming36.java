public class ArrayProgramming36 
{
    public static void main(String[] args) {    
        int rows, cols;    
          
            int a[][] = {       
                            {1, 2, 3},    
                            {8, 6, 4},    
                            {4, 5, 6}    
                        };    
                  
                
              rows = a.length;    
              cols = a[0].length;    
                
              if(rows != cols)//square of matrix
              {    
                  System.out.println("Matrix should be a square matrix");    
              }    
              else 
              {      
                  System.out.println("Lower triangular matrix: ");    
                  for(int i = 0; i < rows; i++)//lower traingular matrix
                  {    
                      for(int j = 0; j < cols; j++)
                      {    
                        if(j > i)    
                          System.out.print("0 ");    
                        else    
                          System.out.print(a[i][j] + " ");    
                    }    
                    System.out.println();    
                }    
            }    
        }    
}
