package Document2;

public class Doc2Pattern16 
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
                System.out.print( k + " " );
            } 
            System.out.println(); 
        }

            for( char i = 69; i >=65 ; i--)
        {
            for( char j = 70; j >= i+1; j--)
            {
                System.out.print( " " );
            }  
            for( char k = 65; k <=i ; k++) 
            {
                System.out.print(  k + " ");
            }

            System.out.println();
        }
            
    }
    
}
