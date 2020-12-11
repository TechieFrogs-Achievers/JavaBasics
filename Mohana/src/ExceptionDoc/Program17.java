package ExceptionDoc;
import java.lang.Class;

class Test1
{
    void method() //method to displaly details
    {
        System.out.println("method from parent class");
    }
}

public class Program17
{
    public static void main(String[] args) 
    { 

        //try and catch blocks to handle exceptions
      try
      {
         Class c=Class.forName("Test1");  
         Test1 t= (Test1)c.newInstance();  //creating an instance to exsisted  class
         t.method();  //method call 
      } 
     // it catches instatiation exception
        catch(InstantiationException ie)
        {
           System.out.println("not found");
        } 
        //it catches class not found exception
        catch(ClassNotFoundException ce)
        {
            System.out.println("class not found ");
        } 

        catch(IllegalAccessException ie)
        {
            System.out.println(ie);
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}