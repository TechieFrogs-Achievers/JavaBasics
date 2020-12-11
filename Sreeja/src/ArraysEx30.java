public class ArraysEx30
 {
    public static void main(String[] args) 
     {
        
    int arr[][] = {{1,2,3},{1,2,3},{1,2,3}};            //initializing the array

    if(arr.length==arr[0].length)           //check the condition of rows and cooumns are equal
    {
        //loop to print lower triangular matrix
        
        for(int i = 0 ; i < 3 ; i++)
        {
            for( int j = 0 ; j < 3 ; j++)
            {
                if(i>=j)
                {
                    System.out.print(" "+arr[i][j]);
                }
                else
                {
                    System.out.print(" "+"0");
                }
            }
            System.out.println("");
        }
    }
    else
    {
        System.out.println("rows and coloumns must be same");
    }
}
 }
