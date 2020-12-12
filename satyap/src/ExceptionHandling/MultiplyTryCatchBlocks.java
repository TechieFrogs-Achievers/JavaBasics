package ExceptionHandling;

public class MultiplyTryCatchBlocks //class for try catch blocks
{
    public static void main(String[] args) 
    {
        try{ //try block for handled the exception
            int a[]=new int[5];
            a[5]=30;
            System.out.println(a[10]);
        }
        catch(ArithmeticException ae) //multiple catch blocks
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException ai) //catch block for Arrays Index out of bound Exception
        {
            System.out.println("Array Index out of bound Excepton occurs");
        }
        catch(NullPointerException n) //catch block for NullPointerException
        {
            System.out.println("Null pointer Exception occurs");
        }
        System.out.println("Rest of code"); //rest of code
    }
}
