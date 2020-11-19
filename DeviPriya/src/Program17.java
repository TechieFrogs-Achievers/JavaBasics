public class Program17 {
    public static void main(String[] args)
    {

        for (int i = 5; i >= 0; i--)
        {
            int alphabet = 65;
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= 5; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }

    }
    
}
