package Document2;
public class Doc2p7 
{
    public static void main(String[] args) 
    {
        for( int i = 4 ; i >= 1; i--)
        {
            for( int j =1 ; j <= i; j++)
            {

               System.out.print( j);
            
            }  
             for( int k = 4 ; k >= 1; k--)
             { 
                 if( k > i )
                 {
                     System.out.print( "*" );
                 } 
                 else
                 {
                    System.out.print( k );
                 }
             }
            
            System.out.println();
        }
    }
}
