package ExceptionDoc;

public class Program23 
{
    public static void main(String[] args) 
    {  

        //try catch and finally

        //try block to handle exception
        try
        {
            String str = null;//giving null value to string it throws an exception

            System.out.println(str.length());
        }
         //catch block to catch exception
        catch(NullPointerException ne)
        {
            System.out.println("cannot find length of length of string because it has null value");
        } 
         //it execuets in any condition
        finally
        {
            System.out.println("finally block");
        }
        
    }
    
}
