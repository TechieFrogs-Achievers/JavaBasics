public class Patternj 
{
    public static void main(String[] args)
    {
        int k = 0;
        
        for( int i = 0; i <= 6-1; i++)
        {
            for ( int j = 0; j <= i; j++ ,k++)
            {
                System.out.print((char)(65+k)+ " ");
                 
            }
            System.out.println( );
        }
        
    }

}
