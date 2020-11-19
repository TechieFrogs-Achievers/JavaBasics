public class Sandglass {
    public static void main(String[] args) {
        int a,b,c=7;
        for(a=c;a>=1;a--)
        {
            for(b=c-a;b>=1;b--)
            {
                System.out.print(" ");
            }
            for(b=1;b<=a;b++)
            {
                System.out.print("* ");
            }
            System.out.println();
        
        }
        for(a=1;a<=c;a++)
        {
            for(b=c-a;b>=1;b--)
            {
                System.out.print(" ");
            }
            for(b=1;b<=a;b++)
            {
                System.out.print("* ");
            }
              System.out.println();
        }
        
    }    
}
