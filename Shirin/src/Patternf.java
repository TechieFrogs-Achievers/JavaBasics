public class Patternf 
{
    public static void main(String[] args) 
    {
        int i;
        int j;
        int k;
        for ( i =0; i<=5; i++) 
        {
            for (j = 5; j>= i; j--)
            {
                System.out.print(" ");
            }
            for( k= 0; k<= i; k++)
            {
                System.out.print((char) (65+k) + " ");

            }
            System.out.println(" ");

        }
        
    }
    
}
