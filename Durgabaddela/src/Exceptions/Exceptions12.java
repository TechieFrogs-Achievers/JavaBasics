package Exceptions;

public class Exceptions12
{
    public static void main(String[] args) 
    {
        try
        {
           Class.forName("durga");//if u tried to use the other class in different packages
        }
        catch(ClassNotFoundException ce)
        {
           System.out.println(ce);
        }
    }
}
