package ExceptionHandling;
import java.util.*;
public class NestedTryStatements 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        //String str=sc.next();
        int div;
        try{
            try
            {
                System.out.println("Division");
                div=i/j;
                System.out.println(div);
            }
            catch(ArithmeticException ae)
            {
                System.out.println(ae);
               
            }
            try{
                int a[]=new int[5];
                a[5]=4;
            }
            //System.out.println("Other Exception");
            catch(ArrayIndexOutOfBoundsException a)
            {
                System.out.println(a);
            }
            System.out.println("Other statements");
        }
        catch(Exception e)
        {
            System.out.println("Handled");
        }
        System.out.println("Normal flow");
    sc.close();
    }
}
