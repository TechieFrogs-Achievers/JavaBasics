public class SecondDocumentContinue2 
{

    public void spaces(int n)
    {
        System.out.println();
        System.out.println("Pattern -------- " +n);
    }
    //Pattern --------- 12
    public void pattern12(int rows)
    {
        spaces(12);
        
        for(int i=0;i <=rows; i++)
        {
            int temp= i,alphabet =65;
            for(int j=i;j>= 0; j--)
            {
                System.out.print((char)(alphabet + temp) +" ");
                temp =temp + 5;
            }
            System.out.println();
        }
    }

    //pattern ---- 15
    public void pattern15(int rows)
    {
        spaces(15);
        for(int i=rows;i >= 1;i--)
        {
            int alphabet= 65;
            for(int j=(rows -i);j >= 1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j <= i;j++)
            {
                System.out.print((char)alphabet +" ");
                alphabet++;
            }
            
            System.out.println();
        }
    }

    //pattern -------- 16
    public void pattern16(int rows)
    {
        spaces(16);
        
        for(int i=1;i <= rows; i++)
        {
            int alphabets =65;
            for(int j=1; j <=(rows - i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j <= i; j++)
            {
                System.out.print((char)alphabets +" ");
                alphabets++;
            }
            System.out.println();
        }
        for(int i=(rows -1);i >= 1;i--)
        {
            int alphabets=65;
            for(int j=(rows - i);j >=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j <= i;j++)
            {
                System.out.print((char)alphabets +" ");
                alphabets++;
            }
            System.out.println();
        }
    }

    //pattern -------17
    public void pattern17(int rows)
    {
        spaces(17);
        for(int i=1;i <= rows;i++)
        {
            int alphabets = 65;
            for(int j=1;j <= rows;j++)
            {
                if(j >= i && j <= rows)
                {
                    System.out.print((char)(alphabets) );
                    // alphabets++;
                }
                else
                {
                    System.out.print(" ");
                }
                alphabets++;
            }
            System.out.println();
             System.out.print(" ");
        }
        for(int i=rows;i >= 1;i--)
        {
            int alphabets = 65;
            for(int j=1;j <= rows;j++)
            {
                if(j >= i && j <= rows)
                {
                    System.out.print( (char)(alphabets) );
                }
                else
                {
                    
                    System.out.print(" ");
                }
                alphabets++;
            }
            
            
            System.out.println();
            System.out.print(" ");
        }

        
    }

    //pattern ---------- 18
    public void pattern18(int rows)
    {
        // for(int i=1;i <= rows; i++)
        // {
        //     int alphabet =65;
        //     for(int j=1;j <= rows; j++)
        //     {
        //         System.out.print((char)alphabet +" ");
        //         alphabet++;
        //     }
        //     System.out.println();
        //     System.out.print(" ");
        // }

        for(int i=1;i <= rows;i++)
        {
            int alphabets = 65;
            for(int j=1;j <= rows;j++)
            {
                if(j >= i && j <= rows)
                {
                    System.out.print( (char)(alphabets)+" " );
                }
                else
                {

                    System.out.print(" ");
                }
                alphabets++;
            }
            
            
            System.out.println();
            // System.out.print(" ");
        }

        for(int i=rows;i >= 1;i--)
        {
            int alphabets = 65;
            for(int j=1;j <= rows;j++)
            {
                if(j >= i && j <= rows)
                {
                    System.out.print( (char)(alphabets)+" " );
                }
                else
                {

                    System.out.print(" ");
                }
                alphabets++;
            }
            
            
            System.out.println();
            // System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        SecondDocumentContinue2 s= new SecondDocumentContinue2();
        s.pattern12(5);
        s.pattern15(6);
        s.pattern16(6);
        s.pattern17(6);
        s.pattern18(6);
        
    }
    
}
