package Document2;

public class Doc2p28 
{
    public static void main(String[] args) 
    {
        for( char i = 65; i <= 70 ; i++)
        { 
            int k = i;
            for( char j = 65; j <=i ;j++)
            {  
                System.out.print( (char)k + " " );
                k = k+5;
            }

            System.out.println();
        
        }
        
    }
    
}
