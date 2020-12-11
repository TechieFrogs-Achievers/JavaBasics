package ExceptionHandling;//package for ExceptionHandling
//import java.util.*;
public class ChainedException //class for program chained Exception
{
    public static void main(String[] args) 
    {
        //Scanner sc=new Scanner(System.in);
        
        try{ //try block for method giving exception
            test(); //method
        }
        catch(ApplicationException ae) //catch block for handled the exception
        {
            System.out.println(ae.getMessage()); //printing the type of exception
        }
    }
    public static void test() throws ApplicationException //method that throws exception
    {
        try{ //try block for arithmetic exception
        int i=10;
        int j=0;
        System.out.println(i/j);
        }
        catch(Exception e) //catch block for handling the arithmetic exception
        {
            throw new ApplicationException(e); //thows the exception
        }
    
    }
}
class ApplicationException extends Exception //class extends the super class
{
    public ApplicationException(Exception e) //subclass
    {
    super(e); //calling the super class
    }
}
