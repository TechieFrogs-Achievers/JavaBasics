package ExceptionHandling;
import java.util.*;
public class ChainedException 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        try{
            test();
        }
        catch(ApplicationException ae)
        {
            System.out.println(ae.getMessage());
        }
    }
    public static void test() throws ApplicationException
    {
        try{
        int i=10;
        int j=0;
        System.out.println(i/j);
        }
        catch(Exception e)
        {
            throw new ApplicationException(e);
        }

    }
}
class ApplicationException extends Exception
{
    public ApplicationException(Exception e)
    {
    super(e);
    }
}
