package ExceptionHandling;
import java.util.*;
public class NumberFormatException2  // class for number Format exception
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //scanner class
        String str=sc.nextLine();
        try{ //try block for throws the exception
            int num=Integer.parseInt(str); //converting string to integer
            System.out.println(num); //printing the number
        }
        catch(NumberFormatException n) //catch block for throwing the exception
        {
            System.out.println("Number Format Exception:"+n);// printing the type of exception
        }
        sc.close(); //scanner close
    }
}
