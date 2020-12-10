public class ArraysEx28 
{
     public static void main(String[] args) 
     {
    
    int arr[][] = {{1,0,0},{0,2,3},{1,0,0}};            //initialize the array

    int zero = 0 ;
    int count = 0;

    //loop to check the equality of elements with zero
    
    for(int i = 0 ; i < 3 ; i++)
    {
        for(int j = 0 ; j < 3 ; j++)
        {
            if(arr[i][j] == 0)
            {
                zero++;
            }
            else
            {
                count++;
            }
        }
    }

    //condition to check the sparse matrix
    
    if(zero>count)
    {
        System.out.println("It is a sparse matrix");
    }
    else
    {
        System.out.println("It is not a sparse matrix");
    }
     }
}
