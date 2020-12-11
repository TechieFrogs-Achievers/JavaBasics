public class ExceptionHandling14 
{
    public static void main(String[] args) 
    {
        int a=100,b=0;
        //int c=a/b;
        try
        {
            
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException"+e);
        }
        System.out.println("remaing solution");
    }
}
