package ArrayPrograms;

public class IdentityMatrix27 
{
    public static void main(String[] args) 
    {
        int matrix[][] = {{1,0,0},{0,1,0},{0,0,1}};

        for (int i = 0; i < matrix.length; i++)
         {
            for (int j = 0; j < matrix.length; j++) 
            {
                if(i==j && matrix[i][j] == 1 || i!=j && matrix[i][j] == 0 )//condition checking for identity matrix
                {
                    System.out.println("this is identity matrix");
                }
                else
                {
                    System.out.println("not a identity matrix");
                }
            }
        }
        
    }
    
}
