public class ExceptionHandling24 
{
    public static void main(String[] args) 
    {
        Object string="1";
        try
        {
             int interger=(int) string;//try block
        }
        catch(ClassCastException e)
        {
            System.out.println(" Please properly convert string into an interger");
        }
    }
}
