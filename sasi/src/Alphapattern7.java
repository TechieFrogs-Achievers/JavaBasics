public class Alphapattern7 
{
    public static void main(String[] args)
     {
      char i,j, k=70;
      for( i = k; i >=65; i--)
      {
        for(j=k; j >=i;j--)
         {
           System.out.print(j);
         }
         System.out.println(" ");
        }
    }
}
