public class Program34 {
    public static void main(String[] args)
    {

        int alphabet = 65,rows=5;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                if (j % 2 == 0)
                    System.out.print((char) (alphabet + (rows * (j)) + i) + " ");
                else
                    System.out.print((char) (alphabet + (rows * (j + 1)) - i - 1) + " ");
            }
            System.out.print("\n");
        }
    }

    
}
