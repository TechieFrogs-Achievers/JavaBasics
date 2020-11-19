public class Alphets 
{
    public static void main(String[] args) 
    {
        int n=10;
        for(int i=1; i<=n ;i++)//1
        {
            for(int j=1; j<=n ;j++)
            {
                if(i==1 && j!=n || i==n && j!=n || i==n && j!=n || j==1 || j==n && (i!=1  && i!=n))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
                System.out.println( );
            
        }
        for(int i=1; i<=n ;i++)//2
        {
            for(int j=1; j<=n ;j++)
            {
                if(i==n && (j!=1 && j!=n) || j==1 && i!=n || j==n && i!=n) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
                System.out.println( );
        }

        for(int i=1; i<=n ;i++)//3
        {
            for(int j=1; j<=n ;j++)
            {
                if(i==1 && j!=n || j==1 || j==n && ((i<n/2) && i!=n) || i==(n/2) && j!=n || i==j && i>=(n/2)) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
                System.out.println( );
        }

        for(int i=1; i<=n ;i++)//4
        {
            for(int j=1; j<=n ;j++)
            {
                if(i==1 || i==n || j==1 || i==n/2 && j>n/2 || j==n && i!=4) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
                System.out.println( );
        }

        for(int i=1; i<=n ;i++)//2
        {
            for(int j=1; j<=n ;j++)
            {
                if(i==1 || i==(n/2) || j==1 ||j==n) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
                System.out.println( );
        }
        
    }
}
    
    

