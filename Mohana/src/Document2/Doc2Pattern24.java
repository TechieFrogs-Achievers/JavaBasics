package Document2;

public class Doc2Pattern24 
{
    public static void main(String[] args) 
    {
        String word = "JAVA";
        for( int i = 1 ; i <= word.length(); i++)
        {
            for( int j = word.length() ; j > i ; j--)
            {
                System.out.print( " ");
            }
            for( int k = i * 2 - 1 ; k >=1; k--)
            {
                System.out.print( word.charAt( i -1));
            } 
            System.out.println();
        }
        
    }
    
}
