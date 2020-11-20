package Document2;

public class Doc2Program28 
{
    public static void main(String[] args) 
    {  
        char ch = 65;
        for( int i = 0; i <= 5; i++)
        {
            for( int j = 0 ; j < 5-i; j++)
            {
                System.out.print( (char)(ch + j) );
            } 
            for( int k = 5-i-2 ; k >= 0 ;k--)
            {
                System.out.print( (char)(ch + k));
            }
            System.out.println();
        }        
    }
    
}
