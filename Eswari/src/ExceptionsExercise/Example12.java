package ExceptionsExercise;

//class to handle ClassNotFoundException
public class Example12 
{
    public static void main(String[] args) 
    {
        //try block for CheckedException
        try
        { 
            Class.forName("Eample13"); //reading the class that present in folder
        }
        catch(ClassNotFoundException cn) //catch block for Exception ClassNotFoundException
        {
           // cn.printStackTrace(); //tracing the classnotfoundexception
          System.out.println("Class not found Exception"+cn); //printing the typr of Exception
        
        }

        
    }
}
