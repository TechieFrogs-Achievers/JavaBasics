public class ExceptionHandling4 
{
    public static void main(String[] args) 
    {
        try
        {
         int a[]=new int[5];
         a[5]=30/0;//occre excception 
         System.out.println(a[10]);
        }
        catch(ArithmeticException e)//catch block
        {
            System.out.println("arthmetic condition occure");
        }
        catch(ArrayIndexOutOfBoundsException e)//catch block
        {
            System.out.println("array of the block");
        }
        catch(Exception e)//catch block
        {
            System.out.println("rest of the code");
        }
        System.out.println("ok block");
    }
}
