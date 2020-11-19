package Document2;

public class Doc2p16 
{
    public static void main(String[] args)  
    {
        String name = "ISTS";

        for( int i = 0 ;i <= name.length()-1 ;i++)
        {
            for( int j = 0 ; j <= i ;j++) 
            {
                System.out.print( name.charAt(j) +" ");
            } 
            System.out.println();
        }
        
    }
    
}
