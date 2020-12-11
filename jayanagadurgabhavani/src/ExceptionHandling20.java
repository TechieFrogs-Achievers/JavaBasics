public class ExceptionHandling20 
{
    public static void main(String args[])
    {  
        try
        {
          try
          {
            int a=122,b=0;
           int  c=122/0;
           System.out.println(c);//try block
         }
         catch(ArithmeticException c)
         {
             System.out.println(c);//catch block
         }
         try
         {
            int a=20,b=0;
            int d=a/b;
            System.out.println(d);//try block
         }
         catch(ArithmeticException d)
         {
             System.out.println(d);//catch block
         }
        }
         catch(Exception d)
         {
             System.out.println("reming bloc");//catch block
         }
         finally{
         System.out.println("ok block");//finally block
         }
     }  
}
