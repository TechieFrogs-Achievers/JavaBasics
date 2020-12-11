public class ExceptionHandling1 
{
    public static void main(String[] args) 
    {
        try
        {
        int a=5,b=0;
        int c=a/b;//raise exception condition
        }
        catch(ArithmeticException c)
        {
            System.out.println(c);// rise the exception condition after that print by the catch block
        }
        System.out.println("rest of ths code......");
    }
}
