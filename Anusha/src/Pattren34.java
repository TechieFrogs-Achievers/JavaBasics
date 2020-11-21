public class Pattren34 
{
   public static void main(String[] args) 
   {
    int ch = 65,rows=8;
    int temp = 1;
    for (int i = 1; i <= rows/2+1 ; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            System.out.print((char) (ch + (temp * j) - 1) + " ");
        }
        System.out.println();
        temp++;
    }
    for (int i = 1; i <= rows  ; i++)
    {
        for (int j = 1; j <= rows / 2 + 1 - i; j++)
        {
            System.out.print((char) (ch + (temp * j) - 1) + " ");

        }
        System.out.println();
        temp++;

    }
   } 
}
