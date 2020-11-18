public class Sandalpattern 
{
    public static void main(String[] args) 
    {
        int s=7;
        for ( int i=s; i>=1; i--)
        {
            for (int j=s-i; j>=1; j--)
            {
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for ( int i=1;i<=s; i++)
        {
            for (int j=s-i; j>=1; j--)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
    

