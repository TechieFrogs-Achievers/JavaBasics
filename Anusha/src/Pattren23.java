public class Pattren23 
{
  public static void main(String[] args) 
  {
    for (int i = 0; i <= 5; i++)
    {
        int ch = 65;
        for (int j = 5; j > i; j--)
        {
            System.out.print(" ");
        }

        for (int k = 0; k <= i; k++)
        {
            System.out.print((char) (ch + i) + " ");
        }
        System.out.println();
    }
  }  
}
