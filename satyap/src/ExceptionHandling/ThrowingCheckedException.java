package ExceptionHandling;
//import java.util.*;
public class ThrowingCheckedException 
{
    public static void main(String[] args) 
    {
        //Scanner sc=new Scanner(System.in);
        try{
            throw new Exception("Throwing Exception");
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage());
        
        }

    }
}
