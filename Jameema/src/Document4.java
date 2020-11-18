public class Document4
 {
    int i,j, n=6, num=1;
    
    public void Pattern13()
    {
        int space=n;
        System.out.println("\n Pattern13");
        for(i=0;i<n;i++)
        {
            for(j=1;j<space;j++)
            {
                System.out.print(" ");
            }
            num=1;
            for(int k=0;k<=i;k++)
            {
               System.out.print(((char)(64+num))+ " ");
                 num = num * (i-k)/(k+1);

            }
            space--;
            System.out.println();
        }   

    }
    public void Pattern14()
    {
        System.out.println("\n Pattern14");
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(((char)(j+65))+ " ");
            }
            for(j=i-1;j>=0;j--)
            {
                System.out.print(((char)(j+65))+ " ");
            }
            System.out.println();
        }
    
    }
    public void Pattern17()
    {
        System.out.println("\n Pattern17");
        for(i=0;i<=n-1;i++)
        {
            for(j=i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n-1;j++)
            {
                System.out.print(((char)(j+65))+ "");
            }
            System.out.println();
        }
        for(i=n-1;i>=0;i--)
        {
            for(j=i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n-1;j++)
            {
                System.out.print(((char)(j+65))+ "");
            }
            System.out.println();
        }
    }
    public void Pattern18()
    {
        System.out.println("\n Pattern18");
        for(i=0;i<=n-1;i++)
        {
            for(j=i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n-1;j++)
            {
                System.out.print(((char)(j+65))+ " ");
            }
            System.out.println();
        }
        for(i=n-1;i>=0;i--)
        {
            for(j=i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n-1;j++)
            {
                System.out.print(((char)(j+65))+ " ");
            }
            System.out.println();
        }
    }
    public void Pattern19()
    {
        System.out.println("\n Pattern19");
        for(i=n-1;i>=0;i--)
        {
            for(j=i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n-1;j++)
            {
                System.out.print(((char)(j+65))+ " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
     {
         Document4 d = new Document4();
         d.Pattern13();
         d.Pattern14();
         d.Pattern17();
         d.Pattern18();
         d.Pattern19();
        
    }
}
