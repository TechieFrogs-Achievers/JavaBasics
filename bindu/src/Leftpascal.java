public class Leftpascal {
    public static void main(String[] args) {
        int e,f,b=7;
        for(e=1;e<=b;e++)
        {
            for(f=b-e;f>=1;f--)
            {
                System.out.print(" ");
            }
            for(f=1;f<=e;f++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(e=b-1;e>=1;e--)
        {
            for(f=b-e;f>=1;f--)
            {
                System.out.print(" ");
            }
            for(f=1;f<=e;f++)
            {
                System.out.print("*");
            }
            System.out.println();
        
        }
    }
    
}
