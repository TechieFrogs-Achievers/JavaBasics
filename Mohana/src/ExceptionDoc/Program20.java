package ExceptionDoc;

public class Program20 
{
    public static void main(String[] args) 
    {
        String name = "  123";  //"  mohana"; //given some space before the variable it throws an exception

        //try and catch blocks to handle exception

        try
        {
            int num = Integer.parseInt(name); //converting  string into interger
            
            System.out.println(num);

        } 

        catch(NumberFormatException ne) 
        //if string contains any spaces or any null values or floating ponits it catches that exception
        {
          System.out.println("please provide correct format");
        }
        
    }
    
}
