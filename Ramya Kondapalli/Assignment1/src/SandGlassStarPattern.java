public class SandGlassStarPattern {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int k=11;k>=2*i-1;k--)
            {
                System.out.print("* ");
            }
        }
        for (int i=1;i<=10;i++)
        {
            System.out.println();
            for(int j=10;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
        }
    }
}
