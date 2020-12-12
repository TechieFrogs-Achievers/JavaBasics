public class Exception20 
{
     public static void main(String[] args) 
     {
        //code to be checked for an exception
        
        try
        {
            int number = Integer.parseInt("sree");  //trying to convert into number

            System.out.println(number);
        }
        catch(NumberFormatException e)      //to handle the exception
        {
            System.out.println("Number format exception");
        }
    }
}
