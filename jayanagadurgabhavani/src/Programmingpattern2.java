public class Programmingpattern2 
{
    public static void main(String[] args)
    {
        int rows=12;
        
        System.out.println("** Printing the pattern... **");
        
        for (int i = 1; i <= rows; i++)
        {
            int j = i;
            
            for (int k = 1; k <= rows; k++) 
            { 
                System.out.print(j + " "); 
                j++; 
                if (j > rows)
                    j = 1;
            }
            System.out.println();
        }
        
    }
}
