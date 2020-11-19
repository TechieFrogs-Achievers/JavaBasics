public class Labledforloop 
{
    public static void main(String[] args) 
    {
        loop1 :

        for( int i = 1; i <= 4 ; i++)
        {  
            for( int j = 1 ; j <=4 ; j++ )
            {
                if( i == 2 & j == 2)
                {
                    break loop1;
                } 
                System.out.println( i + " " + j);
            }

        }
        

    }
    
}
