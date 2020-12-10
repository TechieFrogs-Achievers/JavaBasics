public class ExceptionHandling12 
{
    public static void main(String[] args) 
    {
        int a=10,b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println(a/(b+2));
        }
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("multiple exception");
        }
    }
}
