public class Patternn 
{
    // pattern 14 (alphabets)
    public static void main(String[] args) 
    {
         for( int i = 1; i <= 6; i ++)
         {
             for (int  j = 1; j <= i; j++)
             {
                 System.out.print((char)(64+j)+ " ");
             }
             for (int k= i-1; k >= 1; k--)
             {
                 System.out.print((char)(64+k)+ " ");
             }
             System.out.println();
         }
        
    }
    
}
