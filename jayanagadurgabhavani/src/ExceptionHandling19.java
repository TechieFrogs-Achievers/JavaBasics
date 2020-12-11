

public class ExceptionHandling19 
{
    public static void main(String[] args) 
    {
        try{  
            int data=25/0;  
            System.out.println(data);  //try block 
           }  
           catch(ArithmeticException e)
           {
               System.out.println("first catch block");//catchblock
            } 
            
            catch(Exception e)
            {
                System.out.println("second catch block");//catch block
            } 
           finally
           {
               System.out.println("finally block is always executed");//finally block
 
           }
           System.out.println("rest of the code..."); 
    }
}
