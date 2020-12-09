public class ArrayExample42
 {
     public static void main(String[] args) 
     {
         
     
    //initializing array values
    int a[][] = {{4,2,3},{5,5,6},{2,1,6}};
    int b[][] ={{2,2,5} ,{3,2,5} ,{1,2,7}};
    int c[][] = new int[3][3];
    //loops to iterate upto array length
    for(int i =0; i <a.length;i++)
    {
        for(int j =0; j<b.length;j++)
        {
            c[i][j]  += a[i][j] +b[i][j]; //adding two matrices and the sum is storing in another variable
        }
    } 

    System.out.println("addition of two matrices ");
    //loops to print final array
    for(int i =0; i <c.length;i++)
    {
        for(int j =0; j<c.length;j++)
        {
            System.out.print( c[i][j] + " ");//printing final array       
         } 

         System.out.println();
        }
        }

    
}
