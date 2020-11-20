public class Pattren27 
{
   public static void main(String[] args) 
   {
    for (int i = 0; i < 5; i++)
    {
        int ch = 65;
        for (int j = 0; j < 5; j++)
        {
            System.out.print((char) (ch + i+j));
        }
        System.out.println();
    } 

   }
    
}
