public class Program25 {
    public static void main(String[] args)
    {
        System.out.println("** Printing the pattern... **");

        for (int i = 0; i < 5; i++)
        {
            int alphabet = 65;
            for (int j = 0; j < 5; j++)
            {
                System.out.print((char) (alphabet + i+j));
            }
            System.out.println();
        }
    }

    
}
