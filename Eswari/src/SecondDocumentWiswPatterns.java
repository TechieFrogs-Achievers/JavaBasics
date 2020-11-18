public class SecondDocumentWiswPatterns 
{
    public void halfPyramidAlphabets(int rows)
    {
        for(char i=65;i <=rows; i++)
        {
            for(char j=65; j<=i; j++)
            {
                System.out.print(j +" ");

            }
            System.out.println();
        }
    }

    //Pattern----2
    public void halfPyramidAlphabets1(int rows)
    {
        for(char i=65;i<=rows; i++)
        {
            for(char j=65;j <= i; j++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
    //pattern -------- 3
    public void halfPyramidAlphabets2(int rows)
    {
        for(char i=65; i <= rows; i++)
        {
            for(char j=65;j <= i; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
        for(char i = (char)rows;i >=65; i--)
        {
            for(char j=65;j <=i; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    
    //pattern ---- 4
    public void pattern3(int rows)
        {
            for(char i = (char)rows;i >=65; i--)
            {
                for(char j=65;j <=i; j++)
                {
         
                    System.out.print(j +" ");
                }
                System.out.println();
            }
            for(char i=65; i <= rows; i++)
            {
                for(char j=65;j <= i; j++)
                {
                    System.out.print(j +" ");
                }
                System.out.println();
            }

        }
        
        //pattern ------5
        public void pattern4(int rows)
        {
            for(char i=69;i>=rows;i--)
            {
                for(char j=i;j >=rows;j--)
                {
                    System.out.print(j +" ");
                }
                System.out.println();            
            }
            for(char i=(char)rows;i<=69;i++)
            {
                for(char j=i;j >=rows;j--)
            {
                System.out.print(j +" ");
            }
            System.out.println();            
        }

        }
    
    public static void main(String[] args) {
        SecondDocumentWiswPatterns s= new SecondDocumentWiswPatterns();
        System.out.println("Pattern - 1");
        s.halfPyramidAlphabets(70);
        System.out.println("Pattern  = 2");
        s.halfPyramidAlphabets1(70);
        System.out.println("Pattern  -3"); 
        s.halfPyramidAlphabets2(69);
        System.out.println("Pattern ---- 4");
        s.pattern3(70);
        System.out.println("Pattern ----- 5");
        s.pattern4(65);
    }
    
}
