public class HalfPyramidUsingAlphabets {
    public static void main(String[] args) {
        for (int i=65;i<=69;i++)
        {
            System.out.println();
            for (int j=65;j<=i;j++)
                System.out.printf("%c ",i);
        }
    }
}
