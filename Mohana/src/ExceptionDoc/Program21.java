package ExceptionDoc;

public class Program21 
{
    public static void main(String[] args) 
    {
         int a[] = new int[5];
         
         //try and catch blocks to handle exceptions
         try
         {
             a[6] = 40/0; //it gives arihematic exception

             System.out.println(a[6]); //it gives array index out of bound exception

         }  

         //multiple catch blocks to handle differnt exceptions

         catch(ArrayIndexOutOfBoundsException aie)
         {
             System.out.println("array idex limit exceeds");
         }
        catch(ArithmeticException ae)
        {
            System.out.println("Divide by 0 cant done");
        }

        catch(Exception e)
        {
          System.out.println(e);
        }
    }
    
}
