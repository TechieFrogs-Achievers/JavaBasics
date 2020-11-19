package Document2;

public class Doc2Pattern23 
{
    public static void main(String[] args) 
    {
        for( char i = 65; i <= 70; i++)
        {
            for( char j = 70 ; j > i ; j--)
            {
                System.out.print(" ");
            } 
            for( char k = 65; k <= i ; k++) 
            {
                System.out.print( i + " "  );
            } 
            System.out.println(); 
        }
        
    }
    
}
