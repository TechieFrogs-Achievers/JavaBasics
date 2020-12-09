public class ArrayProgramming37 
{
    public static void main(String[] args) {  
        int rows, cols;   
        int a[][] = {     
                        {9, 8, 3},  
                        {2, 5, 4},  
                        {5, 5, 6}  
                    };  
            
          //Calculates number of rows and columns present in given matrix  
          rows = a.length;  
        cols = a[0].length;  
          
        if(rows != cols)
        {  
            System.out.println("Matrix should be a square matrix");  
        }  
        else 
        {  
            System.out.println("Upper triangular matrix: ");  
            for(int i = 0; i < rows; i++)//upper triangle of matrix
            {  
                for(int j = 0; j < cols; j++)
                {  
                  if(i > j)  
                    System.out.print("0 ");  
                  else  
                    System.out.print(a[i][j] + " ");  
                }  
                System.out.println();  
            }  
        }  
    }  
}
