public class RightPascal {
    public static void main(String[] args) {
        for(int i=1;i<=8;i++)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
        }
        for(int i=7;i>=1;i--)
        {
            System.out.println();
            for(int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
        }
    }
}
