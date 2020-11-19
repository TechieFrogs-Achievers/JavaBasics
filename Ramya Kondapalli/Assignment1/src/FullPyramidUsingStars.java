public class FullPyramidUsingStars {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            System.out.println();
            for (int j=5;j>=i;j--)
            {
                System.out.print("  ");
            }

            for (int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
        }
    }
}
