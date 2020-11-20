public class Patternm 
{
    public static void main(String[] args) 
    {
        // pattern 13 (alphabets)
        int n =6;
        int m = n ;
        for ( int i =0 ; i < n; i ++)
        {
            for ( int j = 1; j < m; j++)
            {
                System.out.print(" ");
            }
              int num = 1;
            for (int  k= 0; k <= i; k++)
            {
                System.out.print((char)(64+num) + " ");
                num = num*(i-k)/(k+1);
            }
            m--;
            System.out.println(" ");

        }
        
    }
    
}
