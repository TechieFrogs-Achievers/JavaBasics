public class Pattren5 
{
    public static void main(String[] args) 
    {
        for (int i = 5; i >= 0; i--)
        {
            int ch = 65;
            for (int j = i; j >= 0; j--)
            {
                System.out.print((char) (ch + j) + " ");
                
            }
            System.out.println();
        }

        for (int i = 0; i <= 5; i++)
        {
            int ch = 65;
            for (int j = i; j >= 0; j--)
            {
                System.out.print((char)(ch + j) + " ");
            }
            System.out.println();
        }
        /*
        for (int i = 0; i <= 5; i++)
        {
            int ch=65;
            for (int j = 5; j >= i; j--)
            {
                System.out.print((char) (ch + j) + " ");
            }
            System.out.println();
        }
        for (int i = 5; i >= 0; i--)
        {
            int ch = 65;
            for (int j = 5; j >= i; j--)
            {
                System.out.print((char) (ch+ j) + " ");
            }
            System.out.println();
            
        } */
    }
}
