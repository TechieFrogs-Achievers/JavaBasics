public class ExceptionHandling10 
{
    public static void main(String[] args) 
    {
        // nested exception handling
        try
        {
          try
          {
            int a=10,b=0;
           int  c=10/0;
           System.out.println(c);
         }
         catch(ArithmeticException c)
         {
             System.out.println(c);
         }
         try
         {
            int a=20,b=0;
            int d=a/b;
            System.out.println(d);
         }
         catch(ArithmeticException d)
         {
             System.out.println(d);
         }
        }
         catch(Exception d)
         {
             System.out.println("reming bloc");
         }
         System.out.println("ok block");
        
    }
}
