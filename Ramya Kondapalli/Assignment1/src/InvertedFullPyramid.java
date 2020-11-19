public class InvertedFullPyramid {
    public static void main(String[] args) {
       for (int i=1;i<=5;i++)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for (int k=9;k>=2*i-1;k--)
            {
                System.out.print("* ");
            }
        }
    }
}
