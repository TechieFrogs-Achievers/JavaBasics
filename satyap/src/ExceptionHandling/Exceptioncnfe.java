package ExceptionHandling; //package for ExceptionHandling
//import java.io.IOException;
//import java.lang.Throwable.*;
public class Exceptioncnfe //class for ClassNotFoundException
{
    public static void main(String[] args) 
    {
        try{ //try block for CheckedException
            Class.forName("CheckedException"); //reading the class that present in folder
        }
        catch(ClassNotFoundException cn) //catch block for Exception ClassNotFoundException
        {
           // cn.printStackTrace(); //tracing the classnotfoundexception
          System.out.println("Class not found Exception"+cn); //printing the typr of Exception
        
        }
    }
}
