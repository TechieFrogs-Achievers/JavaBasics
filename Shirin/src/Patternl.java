public class Patternl
{
    public static void main(String[] args)
    {
        
        for ( int i=0; i<= 5; i++)
        {
            
            int jump=i;
            for (int j = i; j >= 0; j--)
            {
                System.out.print((char)(65+ jump)+ " ");
                jump = jump + 5;
            }
            
            System.out.println( );
        }
        
    }
    
}
