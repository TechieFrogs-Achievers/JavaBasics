public class Program26 {
    public static void main(String[] args)
    {
        for (int i = 0; i <= 5; i++)
        {
            int alphabet = 65;
            for (int j = 0; j < 5-i; j++)
            {
                System.out.print((char) (alphabet + j));
            }
            for (int k = 5-i-2; k >= 0; k--)
            {
                System.out.print((char) (alphabet + k));
            }
            System.out.println();
        }
    }

    
}
