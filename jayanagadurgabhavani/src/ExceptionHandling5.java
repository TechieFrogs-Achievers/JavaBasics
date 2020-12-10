

public class ExceptionHandling5
{
   public static void main(String[] args)
    {
       try
       {
           int data=10/0;//exception occre
           System.out.println(data);
       }
       catch(ArithmeticException e)//catch bloch
       {
           System.out.println(10/(0+2));
           System.out.println("ok code");
       }
       finally
       {
           System.out.println("this is the final block");//finally block
       }
   }
}
    

