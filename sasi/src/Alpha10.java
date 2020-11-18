public class Alpha10
{
    public static void main(String[] args)
     {
       char k=1;
        for(char i = 'A'; i <='F'; i++)
     {
          for(char j='A'; j <= i;j++,k++)
          {
              System.out.print((char)+(k+64));
            }
              System.out.println();
            }
    }
    
}
