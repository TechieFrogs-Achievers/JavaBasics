package Exceptions;

public class ExceptionHandling19 
{
    public static void main(String[] args) 
    {
        Object string="1";
        try
        {
             int interger=(int) string;
        }
        catch(ClassCastException e)
        {
            System.out.println(" Please properly convert string into an interger");
        }

    }
}
