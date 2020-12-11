public class ArrayExample29
{
    public static void main(String[] args)
    {
        int[][] a = {{1,2,3},{6,8,5},{7,8,2}}; 
        int[][] b = {{1,2,3},{6,8,5},{7,8,2}};
        boolean bol = true;
       for(int i = 0; i <3; i++)
         {
             for(int j =0 ; j <3;j++)
             {
                 if(a[i][j] != b[i][j])//condition two check both are equal are not
                 {
                     bol = false;
                 } 

             }
         } 
         if(bol)
         {
             System.out.println("Both  matrices are equal");
         }  
         else{
             System.out.println(" both matrices are not equal");
         }
    }
}
