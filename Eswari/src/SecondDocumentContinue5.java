public class SecondDocumentContinue5 
{
    public void spaces(int n)
    {
        System.out.println();
        System.out.println("Pattern ----- " +n);
    }
    //pattern ---- 28
    public void pattern28(int rows)
    {
        spaces(28);
        
        for (int i = 0; i <= rows; i++)
        {
            int alphabet = 65;
            for (int j = 0; j < rows-i; j++)
            {
                System.out.print((char) (alphabet + j));
            }
            for (int k = rows-i-2; k >= 0; k--)
            {
                System.out.print((char) (alphabet + k));
            }
            System.out.println();
        }
    }

    //pattern ----- 29
    public void pattern29(int rows)
    {
        spaces(29);
        int alphabet = 65;
            
            for(int i=0;i<= rows;i++)
            {
                for(int j=0;j<=rows-i;j++)
                {
                    System.out.print((char)(alphabet+j));
                }
                for(int k=1;k<=i*2-1; k++)
                {
                    System.out.print(" ");
                }
                for(int l=rows-i; l>=0; l--)
                {
                    if(l!=rows) 
                        System.out.print((char)(alphabet+l));
                }
               System.out.println();
            }
    }

    //pattern ------ 30
    public void pattern30(int rows)
    {
        spaces(30);
        int alphabet = 65;
        
        for(int i=0;i<= rows;i++)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print((char)(alphabet+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows)    
                    System.out.print((char)(alphabet+l));
            }
           System.out.println();
        }
        
        for(int i=rows-1;i>=0 ;i--)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print((char)(alphabet+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows) 
                    System.out.print((char)(alphabet+l));
            }
           System.out.println();
        }
        
    }

    //pattern ------33
    public void pattern33(int rows)
    {
        spaces(33);
        int alphabet = 65;
        int k = 1;

        for (int i = 1; i <= rows; i++)
        {
            k = i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (alphabet + k - 1) + " ");
                k = k + rows - j;
            }
            System.out.println();
        }

    }
    //pattern ------ 34
    public void pattern34(int rows)
    {
        spaces(34);
        int alphabet = 65;
        int temp = 1;
        for (int i = 1; i <= rows / 2 + 1; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (alphabet + (temp * j) - 1) + " ");
            }
            System.out.println();
            temp++;
        }
        for (int i = 1; i <= rows / 2; i++)
        {
            for (int j = 1; j <= rows / 2 + 1 - i; j++)
            {
                System.out.print((char) (alphabet + (temp * j) - 1) + " ");

            }
            System.out.println();
            temp++;
        }
    }
    public static void main(String args[])
    {
        SecondDocumentContinue5 s=new SecondDocumentContinue5();
        s.pattern28(5);
        s.pattern29(5);
        s.pattern30(5);
        s.pattern33(5);
        s.pattern34(9);
    }
    
}
