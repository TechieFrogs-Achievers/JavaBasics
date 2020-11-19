package Document2;

public class Doc2p28 
{
    public static void main(String[] args) 
    {
        for( char i = 65; i <= 70 ; i++)
        {
            for( char j = 65; j <=i ;j++)
            {  
                if( i == j)
                {
                    System.out.print( i + " ");
                } 
                else
                {
                System.out.print( j + " "); 
                }
            }  
            for( char k = 65 ;k >= i ; k--)
            {
                System.out.print( k);
            }

            System.out.println();
        
        }
        
    }
    
}
