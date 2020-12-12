package Exceptions;

public class Exceptions21 
{ 
    public static void main(String[] args)
    {
        int a[] = new int[8];
         
         //try and catch blocks to handle exceptions
         try
         {
             a[9] = 10/0; //it gives arihematic exception

             System.out.println(a[9]); //it gives array index out of bound exception

         }  

         //multiple catch blocks to handle differnt exceptions

         catch(ArrayIndexOutOfBoundsException aie)
         {
             System.out.println(aie);
         }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }

        catch(Exception e)
        {
          System.out.println(e);
        }
    }
    
}
