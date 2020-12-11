public class Exception3 
{
    public static void main(String[] args) 
    {
        int age = 20;       //initializing the variable

        //condition to check the age
        
        if(age < 18)
        {
            throw new ArithmeticException("not valid");     //using throw keyword to handle the exception
        }
        else
        {
            System.out.println("Welcome to vote");
        }
    }
}
