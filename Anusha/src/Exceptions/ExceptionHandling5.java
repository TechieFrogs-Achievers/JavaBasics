package Exceptions;

public class ExceptionHandling5 
{
    public static void main(String[] args) 
    {
       
        try 
         {
            throw new Exception("throwing an exception");//throw an exception
         } 
         catch (Exception e) 
         {
            System.out.println(e.getMessage());//catch block
         }
    }
}
