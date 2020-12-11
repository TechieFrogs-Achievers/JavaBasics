public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        try
        {
        int a=500, b=0;//checked stament(run time)
         System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("print value");
        }
        System.out.println("remaing conditions");
    }
}
