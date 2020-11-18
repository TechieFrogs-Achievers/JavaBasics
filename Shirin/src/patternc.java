public class patternc 
{
    public static void main(String[] args) 
    {
        char i;
        char j;
        for( i='A'; i <='F' ; i++)
        {
            for( j='A'; j<=i;j++)
            {
                 System.out.print(j);
            }
            System.out.println( );
        }
        for ( i='F';i>='A'; i--)
        {
            for( j='A'; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();

        }
        
    }
    
}
