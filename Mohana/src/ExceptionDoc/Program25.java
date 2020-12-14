package ExceptionDoc;

public class Program25 
{
    public static void main(String[] args) 
    {  
        //try and catach blocks to handle exceptions
        try
        {  
            int a[] = {1,2,3,4};
            System.out.println(a[7]);
        } 

        
           catch(ArrayIndexOutOfBoundsException aie)
            {
                System.out.println("array index exceeds");
            }

        //finally block it executes any time    
        finally
        {
            
            System.out.println("from finally block");
          //inside finally also we can give try and catch
            try
            {
                int c = 12/0;
                System.out.println(c);

            }
            catch(ArithmeticException ae)
            {
             System.out.println("divide by zero");
            } 
        }
        
    }
    
}
