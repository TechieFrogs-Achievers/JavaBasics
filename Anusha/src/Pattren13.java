public class Pattren13 
{
   public static void main(String[] args) 
   {
    for (int i = 1; i <= 6; i++)
    {
        int ch = 65;
        for (int j = 6; j > i; j--)
        {
            System.out.print(" ");
        }

        int temp = 1;
        for (int k = 1; k <= i; k++)
        {
            System.out.print((char) (ch - 1 + temp) + " ");
            temp = temp * (i - k) / (k);
        }
        System.out.println();
    } 
   } 
}
