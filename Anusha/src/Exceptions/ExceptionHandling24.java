package Exceptions;

public class ExceptionHandling24 
{
    public static void main(String[] args)
    {
        //main try block
        try
        {
            //nested try block1
            try{
                System.out.println("nested try block1");
                int num=14/0;
                System.out.println(num);
               }
               catch(ArithmeticException e)
               {
                   System.out.println("catch block1 excuted: Arithmeticexception");
               }
               finally
               {
                   System.out.println("finally block1 excuted always:");
               }
            //nested try block2
            try
            {
               System.out.println("nested try block2: ");
               int num2=100/0;
               System.out.println(num2);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("catch block2 excuted: Arrayindexoutofboundsexception");
            }
            finally
            {
                System.out.println("finally block1 excuted always:");
            }
            System.out.println("general statement after block1 and block2");
        }
        catch(ArithmeticException e)
        {
            System.out.println("main block Arithmetic Exception:");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("mein block ArrayIndexOutOfBoundsException");
        }
        catch(Exception e)
        {
            System.out.println("main block general exception");
        }
        finally
        {
            System.out.println("code ended");
        }
        }
    
}
