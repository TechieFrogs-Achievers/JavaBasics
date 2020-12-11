package ExceptionHandling; //package
//import java.util.*;
public class ThrowingCheckedException  //class for Throwing checked exception
{
    public static void main(String[] args) 
    {
        //Scanner sc=new Scanner(System.in);
        try{ //try block
            throw new Exception("Throwing Exception");//throw notation
        }
        catch(Exception e) //catch block for the exception
        {
           System.out.println(e.getMessage()); //prints the type of exception
        
        }

    }
}
