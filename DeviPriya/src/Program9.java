public class Program9 {
    public static void main(String[] args)
    {
        int alphabet = 65;

        System.out.println("** Printing the pattern... **");
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }

}
