package ExceptionDoc;

public class Program13 
{
    public static void main(String[] args) 
    {
         //try catch block to handle arthematic exception
         try
         {
            int a = 4, b = 0;
            int val = a / b; //it throws an exception / bt zero
            System.out.println(" value= " + val);
         }
         catch (ArithmeticException e) // catch block to handle arithmetic exception
        {
            System.out.println(e);
        }
        
    }
    
}
