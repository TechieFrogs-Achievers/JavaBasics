public class Rightpascalpattern 
{
    public static void main(String[] args)
    {
        int r=8;
        for (int i=1; i<=r;i++)
        {
            for( int j=1; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        for (int i =r-1; i>=1; i--)
        {
            for (int j= 1;j<=i;j++)
            {
                System.out.print("*" + " ");

            }
            System.out.println(" ");
        }        
    }
    
}
