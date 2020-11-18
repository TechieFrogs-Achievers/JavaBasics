public class Patterne 
{
    public static void main(String[] args) 
    {
    
        char x ,y;
        for ( x = 'F'; x >= 'A'; x--)
        {
            for ( y = x; y >='A'; y--)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        for ( x = 'A'; x <= 'F';x++)
        {
            for ( y= 'A'; y <= x ; y++)
            {
                System.out.print(y + " ");
            }
            System.out.println( );
        }
                    
        
    }
    
}
