public class Pattren33 
{
  public static void main(String[] args) 
  {
    int ch = 65,rows=5,k=1;
        
    for (int i = 1; i <= rows; i++)
    {
        k = i;
        for (int j = 1; j <= i; j++)
        {
            System.out.print((char) (ch + k - 1) + " ");
            k = k + rows - j;
        }
        System.out.println();
    } 
  }  
}
