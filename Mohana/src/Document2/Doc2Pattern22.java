package Document2;

public class Doc2Pattern22 
{
    public static void main(String[] args) 
    {
        for( char i = 65; i <=70 ;i++)
        {
            for( char j = i; j <= 70 ; j++)
            {
                System.out.print( j );
            } 
            for( char k = 69; k >= i; k--)
            {
                System.out.print(k);
            } 
            System.out.println();
        }
        
    }
    
}
