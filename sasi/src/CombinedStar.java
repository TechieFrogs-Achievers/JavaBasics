public class CombinedStar 
{
    public static void main(String[] args)
     {
        for(int i = 1; i <=7; i++)
        {
             for(int j=1; j <= i;j++)
             {
                 System.out.print("*");
               }
                 System.out.println("");
                 i++;
               }
               for(int i = 1; i <=7; i++) 
         {
             for(int j=7; j >= i;j--)
             {
                 System.out.print("*");
                 i++;
                 }
                  System.out.println("");
                
    }
}
}

