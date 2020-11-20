public class ForLoop 
{
    public static void main(String []args)
    {
    int i ;
    int j ;
        for(i=4; i>1; i--)
        {
            System.out.println(i);
        }



        
        for (i=0; i<5; i++)
        {
            for (j=0; j<=i; j++)
            {
                if ( i==2 && j==2 )
                {
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
