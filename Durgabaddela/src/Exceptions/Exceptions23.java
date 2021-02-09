package Exceptions;

public class Exceptions23
 {
    public static void main(String[] args)
     {
        try
        {
            String s = null;//giving null value to string it throws an exception

            System.out.println(s.length());
        }
         //catch block to handle the exception
        catch(NullPointerException ne)
        {
            System.out.println("occures nullpointer Exception");
        } 
         //final block will even if exceptions are present
        finally
        {
            System.out.println("this finally block");
        }
    }
}
