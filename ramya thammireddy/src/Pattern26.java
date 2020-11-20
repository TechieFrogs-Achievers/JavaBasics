public class Pattern26 
{
    public static void main(String[] args) 
    { 
        int currentRow = 1;
        int counter = 1;
        int rows = 5;
        int alphabet = 65;
            
        System.out.println("** Printing the pattern... **");
        
        for (int i=1; i<= rows; i++)
        {
            if (i % 2 == 0) 
            {
                for (int j = 1; j<=i; j++)
                {
                    System.out.print((char) (counter + alphabet - 1)  +" ");
                    counter++;
                }
            }
            else
            {
                int reverse = currentRow + counter - 1;
                for (int j = 0; j<i; j++)
                {
                    System.out.print((char) (reverse + alphabet -1)+" ");
                    reverse--;
                    counter++;
                }
            }
            System.out.println();
            currentRow++;
        }
    }
}
    

