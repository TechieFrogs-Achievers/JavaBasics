public class ExceptionHandling3 
{
    public static void main(String[] args) 
    {
        int a=10,b=0;
        int data;
        try
        {
           data=a/b;//reside excepton condition
        }
        catch(ArithmeticException d)
        {
            System.out.println(a/(b+2));
        }
        System.out.print("ok this code");
    }
}
