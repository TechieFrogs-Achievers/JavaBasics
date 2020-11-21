public class Pattren36 
{
  public static void main(String[] args) 
  {
    int ch = 65,rows=5;
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < rows; j++)
        {
            if (j % 2 == 0)
                System.out.print((char) (ch + (rows * (j)) + i) + " ");
            else
                System.out.print((char) (ch + (rows * (j + 1)) - i - 1) + " ");
        }
        System.out.print("\n");
    }
    
    int num = 1;
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < rows; j++)
        {
            if (j % 2 == 0)
                System.out.print( (num + (rows * (j)) + i) + " ");
            else
                System.out.print( (num + (rows * (j + 1)) - i - 1) + " ");
        }
        System.out.print("\n");
    }
  }  
}
