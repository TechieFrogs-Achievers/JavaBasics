public class Patterny 
{
    public static void main(String[] args) 
    {
        int row =1;
        int  rcount = 1; 
        for (int  i = 1; i <= 5 ; i++ )
        {
            if ( i% 2==0)
            {
                int reverse = row + rcount -1;
            
            for ( int j= 0; j<i; j++)
              {
                System.out.print((char)( reverse + 65 -1)+" ");
                reverse --;
                rcount ++;
               }
            }
              else 
            {

               for (int k =1; k <= i; k++ )
               {
                 System.out.print((char)(rcount + 65  - 1) + " " );
                rcount ++;
               }
            }
                  System.out.println();
                   row ++;
            
        }
        
    }
     
}
