public class Alpha28 
{
    public static void main(String[] args)
     {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print((char)(65+j));
            }
            for(int k=5-i-2;k>=0;k--)
            {
                System.out.print((char)(65+k));
            }
            System.out.println();
        }
    }
}
