//example for printing diamond shape with spaces 
public class DiamondSpacePattern 
{
    public void sandGlassPattern(int rows)
    {
        for(int i=1;i <= rows; i++)         //loop for  how many rows needed
        {
            for(int j=(rows-i);j>=1;j--)    //loop for spaces printing
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)           //loop for printing *
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=rows-1;i >= 1; i--)           //loop for rows for downward part for diamond
        {
            for(int j=(rows-i);j>=1;j--)        // loop for spaces
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)               //loop for printing *
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DiamondSpacePattern d= new DiamondSpacePattern();
        d.sandGlassPattern(6);     //6 rows in upper part and 6 rows in downward part in diamond shape 
    }
    
}
