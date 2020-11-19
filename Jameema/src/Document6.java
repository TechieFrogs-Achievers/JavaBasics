public class Document6 
{
    int i,j,k,n=5;
    public void Pattern26()
    {
        System.out.println("\n Pattern26");
        int num = 1;
        int counter = 1;
        for (i=1; i<=n; i++)
        {
            if (i % 2 == 0) 
            {
                for (j = 1; j<=i; j++)
                {
                    System.out.print((char) (counter + 65 - 1)  +" ");
                    counter++;
                }
            }
            else
            {
                int reverse = num + counter - 1;
                for (j = 0; j<i; j++)
                {
                    System.out.print((char) (reverse + 65 -1)+" ");
                    reverse--;
                    counter++;
                }
            }
            System.out.println();
            num++;
        }
    }
    public void Pattern27()
    {
        System.out.println("\n pattern27");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                System.out.print((char) (65 + i+j));
            }
            System.out.println();
        }
    }
    public void Pattern28()
    {
        System.out.println("\n Pattern28");
        for (i = 0; i <= n; i++)
        {
            for (j = 0; j < n-i; j++)
            {
                System.out.print((char) (65+ j));
            }
            for (k = n-i-2; k >= 0; k--)
            {
                System.out.print((char) (65 + k));
            }
            System.out.println();
        }
    }
    public void Pattern29()
    {
        System.out.println("\n Pattern29");
        for(i=0;i<=n;i++)
            {
                for(j=0;j<=n-i;j++)
                {
                    System.out.print((char)(65+j));
                }
                for(k=1;k<=i*2-1; k++)
                {
                    System.out.print(" ");
                }
                for(int l=n-i; l>=0; l--)
                {
                    if(l!=n) 
                        System.out.print((char)(65+l));
                }
               System.out.println();
            }

    }
    public void Pattern30()
    {
        System.out.println("\n Pattern30");
        for(int i=0;i<= n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print((char)(65+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=n-i; l>=0; l--)
            {
                if(l!=n)    
                    System.out.print((char)(65+l));
            }
           System.out.println();
        }
        
        for(int i=n-1;i>=0 ;i--)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print((char)(65+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=n-i; l>=0; l--)
            {
                if(l!=n) 
                    System.out.print((char)(65+l));
            }
           System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Document6 d = new Document6();
        d.Pattern26();
        d.Pattern27();
        d.Pattern28();
        d.Pattern29();
        d.Pattern30();
        
    }
    
}
