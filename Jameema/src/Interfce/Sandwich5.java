package Interfce;

interface FastFood //interface
{
    public String Veg(); //abstract method
    public void NonVeg();
}

public class Sandwich5 implements FastFood //implementing interface
{
    public String Veg() //implementing abstract method
    {
        return ("this is veg sandwich"); //return string
    }
    public void NonVeg()
    {
        System.out.println("this is Nonveg sandwich");
    }
    public static void main(String[] args)
     {
         Sandwich5 s = new Sandwich5(); //creating object
         System.out.println(s.Veg()); // printing the return string
         s.NonVeg(); //calling method by using
        
    }
}
