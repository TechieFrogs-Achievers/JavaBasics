package ExceptionHandling;
import java.util.*;
public class TryCatchFinally 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        try{
           int  num=i/j;
           System.out.println(num);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithemetic Exception:"+ae);
        }
        finally
        {
           System.out.println("Finally block excutes always");
        }
        System.out.println("Rest of code");
        sc.close();
            
    
    }
}
