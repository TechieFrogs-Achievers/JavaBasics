public class Fullpyramid 
{
    public static void main(String[] args) 
    {
        int p =5;
        for ( int i=1;i<=p; i++)
        {
            for (int j=1; j<=p-i; j++)
            {
                System.out.print(" ");
            }
            for (int k =1; k<=((2*i)-1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("           ");
       

        // inverted pyramid pattern 
        for ( int i= p; i>=1; i--)
        {
            for (int j=1; j<=p-i; j++)
            {
                System.out.print(" ");
            }
            for (int k =1; k<=((2*i)-1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
