public class Programming26 
{
    public static void main(String[] args)
     {
        int i, j, k = 1;
        for (i = 1; i <= 4; i++) 
        {
            for (j = 1; j< i + 1; j++) 
            {
                System.out.print(k++ + " ");
            }
   
            System.out.println();
        }
    }
}
