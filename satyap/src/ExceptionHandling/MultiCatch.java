package ExceptionHandling;
import java.util.*; // package for scanner class
public class MultiCatch  //class for multiple catch  blocks
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class for taking input form console
        int i=sc.nextInt(); //datamembers for console using scanner class
        int j=sc.nextInt();
        int div;
        try{ //try block for exception
            div=i/j; //arithmetic exception
            System.out.println(div);
        }
        catch(ArithmeticException e) //catch block for arithmetic exception
        {
          System.out.println("Arthimetic Exception");
        }
        catch(NullPointerException n) // catch block for null pointer exception
        {
            System.out.println("Null value Exception");
        }
        catch(Exception ex) //catch block for super class
        {
            System.out.println("Super Exception");
        }
        sc.close(); //scanner close
    }
}
