public class ArrayExample27 
{
    public static void main(String[] args)
    {
        int Identity_matrix[][] = {{1,0,0},{0,1,0},{0,0,1}};
        //boolean val = false;

        for (int i = 0; i < Identity_matrix.length; i++)
         {
            for (int j = 0; j < Identity_matrix.length; j++) 
            {
                if(i==j && Identity_matrix[i][j] == 1 || i!=j && Identity_matrix[i][j] == 0 )//condition checking for identity matrix
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
