import java.util.jar.Attributes.Name;

public class ExceptionHandling13 
{
    public static void main(String[] args)
     {
        try
        {
            Class.forName("jaya naga durga bhavani");//printing of the satment
        }
        catch(ClassNotFoundException ex)//class not found exception
        {
           System.out.println(ex);
        }
    }
}
