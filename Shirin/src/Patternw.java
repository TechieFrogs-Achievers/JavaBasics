public class Patternw 
{
    public static void main(String[] args) 
    {
        for ( int  i = 1 ; i <= 6; i++)
        {
            for (int j = 6 ; j >= i ; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++)
            {
                System.out.print((char)(64+i) + " ");
            }
                       
            System.out.println();
        }
        
    }
    
}
