public class Pattern15 
{
    

     public static void main(String[] args)
    {

        System.out.println("** Printing the pattern... **");

        for (int i = 0; i <= 5; i++)
        {
            int alphabet = 65;
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= 5 - i; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}
    

