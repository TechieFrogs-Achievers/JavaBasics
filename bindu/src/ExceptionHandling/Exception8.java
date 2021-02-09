package ExceptionHandling;

public class Exception8 
{
    int method(int i) throws ArithmeticException
    {
        return i/0;   //returns the value
    }
    static boolean method(boolean b)
    {
        return b;   //returns the boolean value
    }
    static double method(int x,int y)
    {
        return x+y;  //adds the two values
    }
    public static void main(String[] args) 
    {
        Exception8 e = new Exception8();   //creates the object for the main class
        try 
        {
            //assigning the values

            System.out.println(method(10,20));   
            System.out.println(method(true));
            System.out.println(e.method(10));
            
        }
        catch(ArithmeticException ae)   // catch block that handles the exception
        {
            System.out.println(ae);  
        }
        
    }
}

