public class ExceptionHandling21 
{
     private static final String inputString = "123.33";   
      
    public static void main(String[] args) 
    {  
        try {  
                 int a = Integer.parseInt(inputString);  
        }
        catch(NumberFormatException ex)
        {  
            System.out.println("Invalid string in argumment");  
          
        }  
    }
}
