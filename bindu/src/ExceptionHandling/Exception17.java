package ExceptionHandling;

public class Exception17 
{
     int a;
    public Exception17( int a)
    {
       this.a=a;
    }
    void message()
    {
      System.out.println("Hello Java");
      System.out.println(a);
    }  
}
         
    class Exceptions17
    {  
    public static void main(String args[])  throws Exception
    {  
      try
        {  
           Class c=Class.forName("InstantiationException");  
           InstantiationException s = (InstantiationException) c.newInstance();
           //s.message();  
         
        }
         //Excepsion handler
         catch(Exception e)
         {
            System.out.println(e);
        }  
         
    }  
}  
    