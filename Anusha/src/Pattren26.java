public class Pattren26 
{
    public static void main(String[] args) 
    {
        int currentRow = 1,counter=1,rows=5,ch=65;
          
        for (int i=1; i<= rows; i++)
        {
            if (i % 2 == 0) 
            {
                for (int j = 1; j<=i; j++)
                {
                    System.out.print((char) (counter + ch - 1)  +" ");
                    counter++;
                }
            }
            else
            {
                int reverse = currentRow + counter - 1;
                for (int j = 0; j<i; j++)
                {
                    System.out.print((char) (reverse + ch -1)+" ");
                    reverse--;
                    counter++;
                }
            }
            System.out.println();
            currentRow++;
        }
    }
}
