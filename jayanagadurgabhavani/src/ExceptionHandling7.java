public class ExceptionHandling7 
{
    public static void main(String[] args) 
    {
        try
        {
         int a=30,b=0;
         int c=a/b;//exception occre
         System.out.println(c);
        }
        catch(ArithmeticException e)//catch block
        {
            System.out.println("arthmetic condition occure");
        }
        catch(ArrayIndexOutOfBoundsException e)//catch block
        {
            System.out.println("array of the block");
        }
        catch(Exception e)//cath block
        {
            System.out.println("rest of the code");
        }
        System.out.println("ok block");
    }
}
