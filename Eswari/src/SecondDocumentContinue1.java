public class SecondDocumentContinue1 
{
    //pattern -----6
    public void pattern6(int rows)
    {
        for(char i=65; i <=rows;i++)
        {
            for(char j=65; j <=(rows-i);j++)
            {
                System.out.print(" ");
            }
            for(char j=65;j <= i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    //pattern ----- 7
    public void pattern7(int rows)
    {
        for(char i=65;i<=rows;i++)
        {
            for(char j=(char)rows;j >= i;j--)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    //pattern ----- 8
    public void pattern8(int rows)
    {
        for(char i=(char)rows;i>=65;i--)
        {
            for(char j=(char)rows;j >= i;j--)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    //pattern ----- 9
    public void pattern9(int rows)
    {
        for(char i = (char)rows;i >=65; i--)
        {
            for(char j=65;j <=i; j++)
            {
         
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }

    //pattern ---- 10
    public void pattern10(int rows)
    {
        char k=65;
        for(char i=65;i<=rows;i++)
        {
            for(char j=65;j <= i;j++,k++)
            {
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }

    //pattern -----11
    public void pattern11(int rows)
    {
        for(char i=(char)rows;i<=69;i++)
        {
            for(char j=i;j >=rows;j--)
            {
                System.out.print(j +" ");
            }
            System.out.println();            
        }
    }
    public static void main(String[] args) 
    {
        SecondDocumentContinue1 s=new SecondDocumentContinue1();
        s.pattern6(69);
        System.out.println("Pattern-----7");
        s.pattern7(69);
        System.out.println("Pattern ----- 8 ");
        s.pattern8(69);
        System.out.println("Pattern ----- 9");
        s.pattern9(69);
        System.out.println("Pattern ------10");
        s.pattern10(70);
        System.out.println("Pattern ------ 11");
        s.pattern11(65);
        
        
    }

    
}
