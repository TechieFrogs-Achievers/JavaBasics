public class Pattren14 
{
   public static void main(String[] args) 
   {
    for (int i = 0; i <= 5; i++)
    {
        int ch = 65;
        for (int j = 0; j <= i; j++)
        {
            System.out.print((char) (ch + j) + " ");
        }
        for (int k = i - 1; k >= 0; k--)
        {
            System.out.print((char) (ch + k) + " ");
        }
        System.out.println();
    } 
   } 
}
