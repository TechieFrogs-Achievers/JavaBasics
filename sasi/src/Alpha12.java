public class Alpha12
 {
    public static void main(String[] args)
     {
         for(int i=0;i<=6;i++)
         {
         int temp=6-1;
         int demo=i;
         for(int j=1;j<=i;j++)
         {
             System.out.print((char)(demo+64));
             demo=demo+temp;
         }
         System.out.println();  
        }      
    }
}
