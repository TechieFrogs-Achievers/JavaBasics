public class Patternk 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i<=5; i++)
        {
            for ( int j =i; j>=0; j--)
            {
                System.out.print((char)(65+j)+ " ");
            }
            System.out.println();
        }
        
    }
    
}
