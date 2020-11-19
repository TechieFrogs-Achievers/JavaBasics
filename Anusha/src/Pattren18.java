public class Pattren18 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i <= 5; i++)
        {
            
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            int ch = 65;
            for (int k = i; k <= 5; k++)
            {
                System.out.print((char) (ch+k)+" ");
                
            }
            System.out.println();
        }
        for (int i = 5; i >= 0; i--)
        {
            
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            int ch = 65;
            for (int k = i; k <= 5; k++)
            {
                System.out.print((char)(ch+k)+" ");
                
            }
            System.out.println();
        }
    }
}
