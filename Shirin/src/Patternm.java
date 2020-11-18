public class Patternm 
{
    public static void main(String[] args) 
    {
        int n =5;
        int m = n;
        for ( int i =0 ; i <= 5; i ++)
        {
            for ( int j = 1; j < m; j++)
            {
                System.out.println(" ");
            }
             int num = 1;
            for (int  k= 1; k <= 5; k++)
            {
                System.out.print((char)(65+num) + " ");
                num = num*(i-k)/(k+1);
            }
            m--;
            System.out.println(" ");

        }
        
    }
    
}
