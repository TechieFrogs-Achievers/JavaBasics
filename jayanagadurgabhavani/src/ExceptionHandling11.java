public class ExceptionHandling11 
{
    public static void main(String[] args) 
    {
        int a=10,b=0;//chaing of exception handling
        try
        {
           System.out.println(a/b);//reide of exception handling
        }
        catch(ArithmeticException e)
        {
            System.out.println("ok done");
        }
        throw new ArithmeticException("run of programming");
    }
}
