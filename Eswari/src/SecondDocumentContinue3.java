public class SecondDocumentContinue3 
{
    // pattern -------- 19
    public void pattern19(int rows)
    {
        for(int i= rows;i >=1;i--)
        {
            int alphabets=65;
            for(int j=1;j <= rows;j++)
            {
                if(j >= i && j <= rows)
                {
                    System.out.print((char)alphabets +" ");
                }
                else
                {
                    System.out.print(" ");
                }
                alphabets++;
            }
            System.out.println();

        }
    }

    //Pattern ------ 14
    public void pattern27(int rows)
    {
        //  int alphabets=65;
        for(int i=1;i <= rows;i++)
        {
            int alphabets=65;
            for(int j=1;j <=rows;j++)
            {
                
                System.out.print((char)alphabets);
                alphabets++;
            }
            
            System.out.println();
        }

    }
    public static void main(String[] args) 
    {
     SecondDocumentContinue3 s=new SecondDocumentContinue3();
     s.pattern19(6);   
     s.pattern27(6);
    }
    
}
