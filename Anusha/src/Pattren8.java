public class Pattren8 
{
    public static void main(String[] args)
    {
        for (int i = 5; i >= 0; i--)
        {
            int ch = 65;
            for (int j = 5; j >= i; j--)
            {
                System.out.print((char) (ch+ j) + " ");
            }
            System.out.println();
        }
    }
}
