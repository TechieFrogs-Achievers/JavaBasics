public class Exception18 
{
    void validate(int age)      //method to check the age
    {
        //code to be check for an exception
        try
        {
            if(age < 18)
            {
                throw new IllegalArgumentException("age must be above 18" );
                
            }
            System.out.println("welcome to vote");
            
        }
        catch(IllegalArgumentException e)       //to handle the exception
            {
                System.out.println("above 18 eligible to vote");
            }
    }
    
    
    
    
    public static void main(String[] args) 
    {
        Exception18 ex = new Exception18();         //create object for class

        ex.validate(5);     //method calling
    }
}
