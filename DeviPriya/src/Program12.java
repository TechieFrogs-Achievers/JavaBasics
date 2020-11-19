public class Program12 {
    public static void main(String[] args)
    {
      for (int i = 1; i <= 6; i++)
        {
            int alphabet = 65;
            for (int j = 6; j > i; j--)
            {
                System.out.print(" ");
            }

            int temp = 1;
            for (int k = 1; k <= i; k++)
            {
                System.out.print((char) (alphabet - 1 + temp) + " ");
                temp = temp * (i - k) / (k);
            }
            System.out.println();
        }
    }

    
}
