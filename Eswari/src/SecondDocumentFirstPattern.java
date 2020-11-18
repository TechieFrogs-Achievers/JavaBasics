public class SecondDocumentFirstPattern
{
    public void firstPattern(int rows)
    {
        for(int i=1; i<= rows;i++)
        {
            for(int j=rows; j >= 1; j--)
            {
                if(j == i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(j);
                }
                
                
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        SecondDocumentFirstPattern s= new SecondDocumentFirstPattern();
        s.firstPattern(5);
    }
}