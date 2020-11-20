public class SecondDocumentFirstPatterns 
{
    public void spaces(int row)
    {
        System.out.println();
        System.out.println("pattern ----- "+row);
    }
    public void pattern(int rows)
    {
        spaces(13);
        int alphabets=97;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            for(int j=rows;j>=i;j--)
            {
                System.out.print((char)alphabets);
            }
            alphabets++;
            System.out.println();
        }
    }

    //pattern ---- 3
    public void pattern3(int rows)
    {
        spaces(3);
        int i,j;
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=rows;j++)
            {
                if(i == j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("0");
                }
            }
                j--;
                System.out.print("*");
                while(j>=1)
                {
                    if(i == j)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print("0");
                    }
                    j--;
                }
                System.out.println();
        }
    }

    //pattern --- 5
    public void pattern5(int rows)
    {
        spaces(5);
        int i,j;
        for(i=1;i<rows;i++)
        {
            for(j=1;j<=(rows/2);j++)
            {
                if(i == j)
                {
                    System.out.print(j);
                }
                else if(i >4 && j == (rows - i))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            j =j - 2;
            while(j>0)
            {
                if(i == j)
                {
                    System.out.print(j);
                }
                else if(i> 4 && j == (rows -i))
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
                j--;
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        SecondDocumentFirstPatterns s=new SecondDocumentFirstPatterns();
        s.pattern(5);
        s.pattern3(4);
        s.pattern5(8);
    }
    
}
