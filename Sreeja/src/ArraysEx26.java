public class ArraysEx26 
{
    public static void main(String[] args) 
    {
        //initializing the two arrays
        
        int arr[][] = {{1,2,3},{3,4,5}};
        int arr1[][] = {{4,5,6},{2,1,3}};

        int arr2[][] = new int[2][3];       //creating another matrix to store the difference of two matrices

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr2[i][j]=arr[i][j]-arr1[i][j];        //subtraction of two matrices
                System.out.print(" "+arr2[i][j]);           //printing the new matrix
            }
            System.out.println();
        }
        
    }
}
