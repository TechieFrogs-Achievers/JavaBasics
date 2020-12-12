package ExceptionDoc;

public class Program22 
{
    public static void main(String[] args) 
    { 
        int a =20 , b =0;
        //multiple try and catch blocks

        //first try block
        try 
        { 
            System.out.println("first try  block"); 

            int c = a/b; 

            System.out.println(c); 
        }
        catch(ArithmeticException ae)
        {
           System.out.println("Divide by zero error");
        } 

        //seconf try block 
        try
        { 
            System.out.println("second ty block");
           int array[] = new int[6];

           array[8] = 9;
           System.out.println(array[8]);

        } 

        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("array index range exceeds");
        } 

        catch(Exception e)
        {
            System.out.println(e);
        } 
    
        
    }
    
}
