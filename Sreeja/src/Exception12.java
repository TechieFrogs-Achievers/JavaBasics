public class Exception12 
{
     public static void main(String[] args) 
     {
        //code to be checked for an exception
        try
        {
            Class.forName("not found");          //method to create object of class
        }
        catch(ClassNotFoundException e)         //to handle the exceptions
        {
            System.out.println("class is not found");
        }
    }
}
