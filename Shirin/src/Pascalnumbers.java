public class Pascalnumbers 
{
    public static void main(String[] args) 
    {
        int n =5;
        int sum=n , p=1;
        for (int i=0; i<n; i++ )
        {
            for ( int j=1; j<sum; j++)
            {
                System.out.print(" ");

            }
            p=1;
            for( int k=0; k<=i; k++)
            {
                System.out.print(p + " ");
                p= p*(i-k)/(k+1);
            }
            sum --;
            System.out.println();
        }


    
        
    }
}
    
