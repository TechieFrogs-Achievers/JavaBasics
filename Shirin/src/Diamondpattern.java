public class Diamondpattern 
{
    public static void main(String[] args) 
    {
        int p =8;
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
        
        for ( int i= p-1; i>=1; i--)
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
