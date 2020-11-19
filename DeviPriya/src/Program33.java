public class Program33 {
    public static void main(String[] args)
    {

        int alphabet = 65,rows=5;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if (j % 2 == 0)
                    System.out.print((char) (alphabet + j * rows - (j - 1) * j / 2 + i - j) + " ");
                else
                    System.out.print((char) (alphabet + j * rows - (j - 1) * j / 2 + rows - 1 - i) + " ");
            }
            System.out.println();
        }
    }

    
}
