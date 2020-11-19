public class Program31 {
    public static void main(String[] args)
    {

        int alphabet = 65,rows=5;
        int k = 1;

        for (int i = 1; i <= rows; i++)
        {
            k = i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (alphabet + k - 1) + " ");
                k = k + rows - j;
            }
            System.out.println();
        }
    }

    
}
