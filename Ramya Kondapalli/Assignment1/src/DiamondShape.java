public class DiamondShape {
    public static void main(String[] args) {
        //upper pattern
        for (int i=0;i<=8;i++)
        {
            System.out.println();
            for (int j=8;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
        }
        //Down pattern
        //int s=1;
        for(int i=7;i>=1;i--)
        {
            System.out.println();

            for(int j=0;j<=8-i;j++)
                System.out.print("  ");
                
                for(int k=1;k<=i*2-1;k++)
                    System.out.print("* ");
        }
    }
}
