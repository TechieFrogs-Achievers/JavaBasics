import java.util.*;
public class Exception21 {
    public static void main(String[] args) 
    {
        int a,b,c,d,f;
        //int a=5,b=0,c,d,f;
        try
        {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter a:");
            a=s.nextInt();
            System.out.print("Enter b:");
            b=s.nextInt();
            System.out.print("Enter c:");
            c=s.nextInt();
            d=a/b;
            System.out.println(d);
            f=a%c;
            System.out.println(f);
        }
            catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
