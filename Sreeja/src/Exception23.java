public class Exception23 
{
    public static void main(String[] args) 
    {
        //code to be checked for an exception
        
        try
        {  
            int data = 6 / 0 ;          //division by zero  
            System.out.println(data);  
        }  
        catch(ArithmeticException e)        //to handle the exception   
        {
            System.out.println(e);
        }  
        //using finally block to execute the code 
        //the code must be executed
        finally                       
        {
            System.out.println("it is always executed");
        }  
            
    }
}
