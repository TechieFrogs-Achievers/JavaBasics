public class Pattren37 
{
   public static void main(String[] args) 
   {
    int ch = 65,rows=5;
    int temp = 0;
    for (int i = rows; i >= 1; i--)
    {
        for (int j = rows; j >= i; j--)
        {
            System.out.print((char) (ch + j - 1) + " ");
            temp = j;
        }
        for (int k = rows - i + 1; k < rows; k++)
        {
            System.out.print((char) (ch + temp - 1) + " ");
        }
        System.out.println();
    }
   } 
}
