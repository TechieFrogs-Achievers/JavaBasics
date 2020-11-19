import java.util.*;
public class Alphabets 
{
    public static void main(String[] rd)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
    

    //NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(j==1 || j==n || i==j && i==(j/2) || i==j &&j>=(i/2))
            {
                System.out.print("N");
            }
            else
            {
            System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println();   

    //EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(i==1 || i==n ||j==1|| i==(n/2) )
            {
                System.out.print("E");
            }
            else
            {
            System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println();

    //EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(i==1 || i==n ||j==1|| i==(n/2) )
            {
                System.out.print("E");
            }
            else
            {
            System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println();

    //RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(i==1 && j!=1 || j==1 || j==n && (i!=1 && i<=(n/2)) ||  i==(n/2) && j!=n || i==j && (i>=(n/2)&&(j>=(n/2))))
            {
                System.out.print("R");
            }
            else
            {
            System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println();
    
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(i==1 || i==(n/2) ||j==1 || j==n)
            {
                System.out.print("A");
            }
            else
            {
            System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println();
    
    //JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ
    
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(i==1 || j==(n/2) || i==(n) && (j!=(n/2) && j<=(n/2)) || j==1 && i>(n/2)+1)
            {
                System.out.print("J");
            }
            else
            {
            System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println();

    // AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(i==1 || i==(n/2) ||j==1 || j==n)
            {
                System.out.print("A");
            }
            else
            {
            System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println();


}
}
