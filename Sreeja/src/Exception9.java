public class Exception9 
{
    public static void main(String[] args) 
    {
        //code to be checked for an exception
        try
        {
            throw new Exception(" throwing checked exception");         //using trow keyword to handle exception
        }
        catch(Exception e)      //to handle the exception
        {
                System.out.println(e);
        }
    }
}
