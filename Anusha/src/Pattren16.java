public class Pattren16 
{
 public static void main(String[] args)
 {
    for (int i = 0; i <= 5; i++)
        {
            int ch = 65;
            for (int j = 5; j >= i; j--)
            {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (ch ) + " ");
                ch++;
            }
            System.out.println();
        }
        for (int i = 0; i <= 5; i++)
        {
            int ch = 65;
            for (int j = -1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= 4 - i; k++)
            {
                System.out.print((char) (ch ) + " ");
                ch++;
            }
            System.out.println(); 
        }    
    }   
}
