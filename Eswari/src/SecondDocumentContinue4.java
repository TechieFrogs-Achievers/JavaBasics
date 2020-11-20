public class SecondDocumentContinue4 
{
    public void spaces(int rows)
    {
        System.out.println();
        System.out.println("Pattern -------- " +rows);
    }

    //pattern --------- 22
    public void pattern22(int rows)
    {
        int alphabet = 65; 

        for (int i= 0; i<= rows ; i++)
        {
            for (int j=i; j<=rows-1; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            for (int k=rows-2; k>=i; k--)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println("");
        }
    }

    //pattern ----- 23
    public  void pattern23(int rows)
    {
        int alphabet = 65; 

        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=rows-1; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print((char) (alphabet + i) + " ");
            }

            System.out.println("");
        }

    }

    //pattern ------ 37
    public void pattern37(int rows)
    {
        int alphabets=65,j,temp=0;
        for(int i=rows;i>=1;i--)
        {
            for( j=rows;j>=i;j--)
            {
                System.out.print((char)(alphabets + j - 1) +" ");
                temp = j;
            }
            for(int k=rows -i +1;k<rows;k++)
            {
                System.out.print((char)(alphabets + temp -1 )+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String args[])
    {
        SecondDocumentContinue4 s= new SecondDocumentContinue4();
        s.pattern22(6);
        s.pattern23(6);
        s.pattern37(6);
    }
}
