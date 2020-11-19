public class LeftPascal {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            System.out.println();
            for(int j=10;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
        }
        for(int i=2;i<=9;i++)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int k=10;k>=i;k--)
            {
                System.out.print("* ");
            }
        }
    }
}
