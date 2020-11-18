public class Alpha5
 {
    public static void main(String[] args) 
    {
        char i,j;
        for( i = 'F'; i >='A'; i--)
       {
            for(j=i; j >='A';j--)
            {
                System.out.print(j+" ");
              }
              System.out.println();
            }
              for( i = 'A'; i <='F'; i++)
       {
            for(j='A'; j <= i;j++)
            {
                System.out.print(j);
              }
                System.out.println(" ");
            }
    }
}
