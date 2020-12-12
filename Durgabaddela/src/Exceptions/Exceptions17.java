package Exceptions;
    
class Demo
{
    void method()
    {
        System.out.println("method from parent class");
    }
}

public class Exceptions17
{
    public static void main(String[] args) 
    {
      try
      {
         Class c=Class.forName("Test1");  
         Demo t= (Demo)c.newInstance();  
         t.method();   
      } 

        catch(InstantiationException ie)//catch block to handle  Exception
        {
           System.out.println("not found");
        } 

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
