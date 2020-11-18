public class SandGlassPyramidPattern 
{

    public void sandGlassPattern(int rows)
    {
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
        
    }
    public static void main(String[] args) {
        SandGlassPyramidPattern s=new SandGlassPyramidPattern();
        s.sandGlassPattern(8);
    }
    
}
