package Document2;

public class Doc2Pattern14 
{
    public static void main(String[] args) 
    {
        char ch = 65;
        for( int i = 0 ; i<= 5 ; i++)
        {
            for( int j = 0; j <= i; j++)
            {
                System.out.print((char)(ch+j)  + " ");
                //ch++;
            } 
            for( int k =i-1  ; k >= 0; k--)
            {
                System.out.print((char)( ch+k) + " ");
            }
            System.out.println();
        }
        
    }
    
}
