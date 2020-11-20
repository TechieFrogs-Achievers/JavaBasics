public class WhileLoop 
{
    public static void main(String[] args)
    {
        int i = 4 ;
        while ( i < 9 )
        {
            if ( i == 6 )
            {
                continue;
            }
            System.out.println(i);
            i++ ;
        }
    }  
}
