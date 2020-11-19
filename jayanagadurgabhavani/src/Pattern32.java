public class Pattern32 
{
    public static void main(String[] args)
    {
        int rows=5;
        System.out.println("## Printing the pattern ##");

        int temp = (rows * (rows - 1)) / 2;
        int alphabet = 65;

        for (int i = 1; i < rows; i++)
        {
            temp = temp - i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (alphabet + temp + j - 1) + " ");
            }
            System.out.println();
        }
    }
}
