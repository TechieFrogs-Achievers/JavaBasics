package Document2;

public class Doc2p12 
{
    public static void main(String[] args) 
    {
        String name1 = "HELLO";
        String name2 = "WORLD";

        //LOOP TO PRINT PATTERN 

        for( int i = 0 ; i <= name1.length()-1 ;i++)
        {
            for( int j = 0; j <= i; j++)
            {
                System.out.print( name1.charAt(j) + " " );
            }  
            for( int k = 4 ; k >= name2.length()-1 ; k--)
            { 
                for( int l = 0 ; l <= k-i; l++)
                { 
                    System.out.print( name2.charAt(l));

                }
                
            }
            System.out.println();
           
        } 
        
    }
    
}
