package Exceptions;

public class ExceptionExercise7 
{
    public static void main(String[] args) 
    {
        try 
        {
            test();    //method creation
        
        }
        catch(ApplicationException ae)   //catch block that holds the exception from try block
        {
            System.out.println(ae.getMessage());
        }
    }
    public static void test() throws ApplicationException
    {
        try 
        {
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
