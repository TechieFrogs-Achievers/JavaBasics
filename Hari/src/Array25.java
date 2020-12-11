public class Array25 
{
    public static void main(String[] args)
    {
        // initialising a matrix
        int arr[][] = {{1,2,3},{4,5,6}};
        // instatiating for transpose matrix
        int transpose[][] = new int[3][2];
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0 ; j < 3; j++)
            {
                // exchanging rows and columns 
                transpose[j][i] = arr[i][j];
            }
        }
        // displaying output matrix
        System.out.println("The tranpose matrix of given matrix is : ");
        for(int i = 0 ; i < 3; i++)
        {
            for(int j = 0; j < 2 ; j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }   
}
