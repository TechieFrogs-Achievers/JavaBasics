package Document2;

public class Doc2Pattern27 
{
    public static void main(String[] args) 
    { 
        int ch = 65;
        for( char i = 0; i <= 5; i++)
        {
            for( char j = 0 ; j <= 5; j++)

            {
                System.out.print( (char)(ch + i+ j) );
            
            } 
            System.out.println(); 
        }
        
    }
    
}
