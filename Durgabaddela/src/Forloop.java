public class Forloop
{
public static  void main(String[] args) 
{
    int n=10;
    for(int i=1; i<=5; i++)//1
    {
        for(int j=1; j<=5; j++)
        {
            System.out.print("D");
        }
        System.out.println();
    }

    for(int i=1; i<=5; i++)//2
    {
        for(int k=5; k>=i; k--)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.println( );
    }

    for(int i=1; i<=5; i++)//3
    {
        for(int k=5; k>=i; k--)
        {
            System.out.print(" "); 
        }
        for(int j=1; j<=5; j++)
        {
            System.out.print("*");  
        }
        System.out.println();
    }
 
    for(int i=1; i<=5; i++)//4
    {
        for(int k=5; k>=i; k--)
        {
        System.out.print(" ");
        }
        for(int j=1; j<= (2*i-1); j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=1; i<=5; i++)//5
    {
        for(int k=1; k<=i; k++)
        {
        System.out.print(" ");
        }
        for(int j=9; j >= (2*i-1); j--)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=5; i>=1; i--)//6
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(i);  
        }
        System.out.println(); 
    }

    for(int i=1; i<=n ;i++)//8
    {
        for(int j=1; j<=n ;j++)
        {
            if(i==j || i+j == n+1 )
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
            System.out.println( );
        }
    }

}
}
