package Document2;

public class Doc2p19 
{ 
    public static void main(String[] args) 
    {
        for( char i = 65 ; i <= 70 ; i++ )
        {
            for( char j = 65 ; j<= i ;j++)
            {
                System.out.print( j  + " ");
            } 
            System.out.println();

        } 

        for( char i = 70 ; i >= 65 ; i-- )
        {
            for( char j = 65  ; j <= i-1; j++)
            {
                System.out.print( j  + " ");
            } 
            System.out.println();

        }
        
    }
    
}
