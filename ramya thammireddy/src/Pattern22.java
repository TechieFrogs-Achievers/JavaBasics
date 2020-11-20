public class Pattern22 
{
    public static void main(String[] args)
    {

        System.out.println("** Printing the pattern... **");

        for (int i = 0; i <= 5; i++)
        {
            int alphabet = 65;
            for (int j = i; j <= 5; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            for (int k = 5 - 1; k >= i; k--)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}