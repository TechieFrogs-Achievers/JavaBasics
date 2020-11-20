public class SecondDocumentContinue3 
{
    public void spaces(int rows)
    {
        System.out.println();
        System.out.println("pattern --------" +rows);
    }
    // pattern -------- 19
    public void pattern19(int rows)
    {
        spaces(19);
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


    //pattern ----- 20
    public void pattern20(int rows)
    {
        spaces(20);
        int alphabet = 65; // ASCII value of alphabet 'A'
        
        for (int i= 0; i<= rows ; i++)
        {
            for (int j=rows-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print((char) (alphabet+k));
            }
            for(int l=i-1; l>=0 ;l--)
            {
                System.out.print((char) (alphabet+l));
            }
            System.out.println();
        }
    }

    // pattern ------ 21
    public void pattern21(int rows)
    {
        spaces(21);
        int alphabets=65;
        for(int i=0;i<=rows;i++)
        {
            for(int j=(rows-1);j>=i;j--)
            {
                System.out.print("A" + " ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print((char)(alphabets + i)+ " ");
            }
            System.out.println();
        }
    }

    //Pattern ------ 27
    public void pattern27(int rows)
    {
        spaces(27);
        //  int alphabets=65;
        for(int i=1;i <= rows;i++)
        {
            int alphabets=65;
            for(int j=1;j <=rows;j++)
            {
                
                System.out.print((char)alphabets + i+j);
                // alphabets++;
            }
            
            System.out.println();
        }

    }

    
    public static void main(String[] args) 
    {
     SecondDocumentContinue3 s=new SecondDocumentContinue3();
     s.pattern19(6);   
     s.pattern27(6);
     s.pattern20(6);
     s.pattern21(6);
    }
    
}
