public class AlphaPattern8 
{
  public static void main(String[] args)
     {
        char i,j, k=70;
        for( i = 65; i <=k; i++)
        {
          for(j=k; j >=i;j--)
           {
             System.out.print(j);
           }
           System.out.println(" ");
        }
      }
    }