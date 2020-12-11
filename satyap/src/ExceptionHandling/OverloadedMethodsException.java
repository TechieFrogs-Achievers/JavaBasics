package ExceptionHandling;

public class OverloadedMethodsException //class for overloaded method Exception
{
    int method(int i) throws ArithmeticException //methods for overloaded
    {
      return i/0; //return value exception
    
    }
    static boolean method(boolean b) //method overloaded of diff paramters
    {
        return !b;
    }
    static double method(int x,int y) //method overloaded for diff parameters
    {
        return x+y;
    }
    public static void main(String[] args) {
        OverloadedMethodsException oe=new OverloadedMethodsException(); //obj creation for class
        try{ //try block for handle the exception
            System.out.println(method(10,20)); //method calling the int,int method
            System.out.println(method(true)); //method calling for boolean method
            System.out.println(oe.method(10)); //method calling for int method
        }
        catch(ArithmeticException ae) //catch block for catching the exceptions
        {
            System.out.println("Exception occurs:"+ae); //printing the type of exception
        }
    }
}
