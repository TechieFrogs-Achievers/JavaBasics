public class Program28 {
    public static void main(String[] args)
    {
        
        int alphabet = 65,rows=5;
        
        for(int i=0;i<= rows;i++)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print((char)(alphabet+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows)    
                    System.out.print((char)(alphabet+l));
            }
           System.out.println();
        }
        
        for(int i=rows-1;i>=0 ;i--)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print((char)(alphabet+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows) 
                    System.out.print((char)(alphabet+l));
            }
           System.out.println();
        }
        
    }

    
}
