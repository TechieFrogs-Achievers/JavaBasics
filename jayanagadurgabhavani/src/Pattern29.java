public class Pattern29 
{
    public static void main(String[] args)
        {
            int rows=6;
            
            System.out.println("## Printing the pattern ##");
            
            int alphabet = 65;
            
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
        }
}
