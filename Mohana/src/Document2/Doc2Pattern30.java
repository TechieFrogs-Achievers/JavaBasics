package Document2;

public class Doc2Pattern30 
{
    public static void main(String[] args) 
    {
        char letter = 65;
        for( int i = 0;i <= 5; i++)
        {
            for( int j = 0; j <= 5-i ; j++)
            {
                System.out.print((char)( letter + j));
            } 
            for( int k =1; k <=i*2-1; k++)
            {
                System.out.print(" ");
            } 
            for( int l = 5-i ; l >= 0;l--)
            {
                if(l!= 5)
                {
                    System.out.print((char)( letter + l));
                } 
            } 
            System.out.println();
        }
        for( int i = 5-1;i >= 0; i--)
        {
            for( int j = 0; j <= 5-i ; j++)
            {
                System.out.print((char)( letter + j));
            } 
            for( int k =1; k <=i*2-1; k++)
            {
                System.out.print(" ");
            } 
            for( int l = 5-i ; l >= 0;l--)
            {
                if(l!= 5)
                {
                    System.out.print((char)( letter + l));
                } 
            } 
            System.out.println();
        }

        
    }
    
}
