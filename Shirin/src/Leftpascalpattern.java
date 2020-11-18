public class Leftpascalpattern 
{
    public static void main(String[] args) 
    {
        int num =7;
        for ( int i=1;i<=num; i++)
        {
            for (int j=num -i; j>=1; j--)
            {
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for ( int i= num-1; i>=1; i--)
        {
            for (int j=num-i; j>=1; j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       
        
    }
    
}

