class Display
{
    //private using constructor
    private Display()
    {
        System.out.println("Private constructor");
    }
}
public class PrivateExamples1
 {
    public static void main(String[] args) 
    {
       Display d = new Display(); //error because private modifier excute with in the class 
       
    }
}
