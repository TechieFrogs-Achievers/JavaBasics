public class Pattren31 
{
   public static void main(String[] args) 
   {
    int ch = 65,rows=5;
    int temp = (rows * (rows - 1)) / 2;
    
    for (int i = 1; i < rows; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            System.out.print((char) (ch + temp - 1) + " ");
            temp--;
        }
        System.out.println();
    }
   } 
}
