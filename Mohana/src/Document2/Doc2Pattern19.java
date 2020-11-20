package Document2;

public class Doc2Pattern19 
{
    public static void main(String[] args) 
    {
        for( char i = 70; i >= 65; i--)
        {
            for( char j = 65; j <= i; j++)
            {
                System.out.print( " ");
            }
            for( char k = i ; k <= 70; k++)
            {
                System.out.print( k + " " );
            }
            System.out.println();

        } 
        
    }
    
}
