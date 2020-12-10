public class ArraysEx34 
{
    public static void main(String[] args) 
    {
       int arr[][] = {{1,2},{1,2},{1,2}};           //initializing the array
       int sum = 0;
        
       //to add each row in a matrix
       
       for(int i = 0 ; i < 3 ; i++)
       {
        
         for(int j = 0 ; j < 2; j++)
        {
           
            sum = sum+arr[i][j];    
        }  
        
        System.out.println("The sum of "+(i+1)+"row is"+sum);
        sum = 0;

       }

       //to add th each coloumn in a matrix

       for(int i = 0 ; i < 3 ; i++)
       {
        
         for(int j = 0 ; j < 2; j++)
        {
           
            sum = sum+arr[j][i];    
        }  
        
        System.out.println("The sum of "+(i+1)+"coloumn is"+sum);
          sum = 0;
        } 


    }
}
