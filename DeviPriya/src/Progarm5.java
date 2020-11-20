public class Progarm5 {
    public static void main(String[] args)
    {
        System.out.println("** Printing the pattern... **");

        for (int i = 5; i >= 0; i--)
        {
            int alphabet = 65;
            for (int j = i; j >= 0; j--)

            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 5; i++)
        {
            int alphabet = 65;
            for (int j = i; j >= 0; j--)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }

    
}
