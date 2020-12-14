package ExceptionHandling;
public class NumberFormatException1 //class for numberformat exception 
{
    private static final String str="183.27"; //string var
    public static void main(String[] args) 
    {
        try{ //try block for handle the exception
            int a=Integer.parseInt(str); //taken str converted to interger
            System.out.println(a); //print the number
        }
        catch(NumberFormatException ex)//catch block for catching the errors
        {
            System.err.println("Invalid String"); //prints the statement
        }
    }
}
