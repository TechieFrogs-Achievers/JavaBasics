public class Alpha16 
{
    public static void main(String[] args) 
    {
        int i,j,k;
         for( i = 0; i <=5; i++)
     {
          for(j=5; j >= i;j--)
          {
              System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                 System.out.print((char)(65+k)+" ");
            }
            System.out.println(" ");
        }
        for( i = 5-1; i >=0; i--)
        {
             for(j=5; j >= i;j--)
             {
                 System.out.print(" ");
               }
               for(k=0;k<=i;k++)
               {
                    System.out.print((char)+(65+k)+" ");
               }
               System.out.println(" ");
           }
       }
    }

