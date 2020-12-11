package ExceptionsExercises;

public class ExceptionPrgrm7
{
    public static void main(String[] args) 
    {
        
        //try block
        try
        { 
            demo(); //method declaring
        }
        catch(ApplicationException e) 
        {
            System.out.println(e.getMessage()); 
        }
    }
    
    public static void demo() throws ApplicationException 
    {  
        //try block 
        // it throws exception
        try
        { 
        int i=10;
        int j=0;
        System.out.println(i/j);
        }
        // catch block
        // it handles the exception
        catch(Exception e)
        {
            throw new ApplicationException(e); 
        }
    
    }
}
// class extending the super class
class ApplicationException extends Exception      
{
    public ApplicationException(Exception e) //subclass
    {
    super(e);     // super 
    }   
}
