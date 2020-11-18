public class DiamondSpacePattern 
{
    public void sandGlassPattern(int rows)
    {
        for(int i=1;i <= rows; i++)
        {
            for(int j=(rows-i);j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=rows-1;i >= 1; i--)
        {
            for(int j=(rows-i);j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DiamondSpacePattern d= new DiamondSpacePattern();
        d.sandGlassPattern(6);
    }
    
}
