package Document2;

public class Doc2p20 
{
    public static void main(String[] args)
    {
        //for firsthalf of pattern

        for( char i = 70 ; i > 65 ; i-- )
        {
            for( char j = 65  ; j <= i; j++)
            {
                System.out.print( j  + " ");
            } 
            System.out.println(); 

        }

        //for secondhalf of pattern
        
        for( char i = 65 ; i <= 70 ; i++ )
        {
            for( char j = 65 ; j<= i ;j++)
            {
                System.out.print( j  + " ");
            } 
           System.out.println();
        } 
        
    }
    
}
