package Exceptions;

public class ExceptionHandling12 
{
    public static void main(String[] args) {
        try
        {
            Class.forName("Package.SampleO");//check the class is present or not
            System.out.println("class loaded at runtime successfully");//statement is excuted when class is presented
        }
        catch(ClassNotFoundException e)
        {//statement is excuted when class is not presented
            System.out.println("class not presenting in classpath dut to :"+e);
        }

    }
}
