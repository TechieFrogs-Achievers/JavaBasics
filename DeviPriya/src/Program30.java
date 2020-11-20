public class Program30 {
    public static void main(String[] args)
    {
        int alphabet = 65,rows=5;
        int temp = (rows * (rows - 1)) / 2;

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
