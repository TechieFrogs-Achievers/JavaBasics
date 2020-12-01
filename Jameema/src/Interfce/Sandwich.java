package Interfce;

interface FastFood
{
    public String Veg();
    public void NonVeg();
}

public class Sandwich implements FastFood
{
    public String Veg()
    {
        return ("this is veg sandwich");
    }
    public void NonVeg()
    {
        System.out.println("this is Nonveg sandwich");
    }
    public static void main(String[] args)
     {
         Sandwich s = new Sandwich();
         System.out.println(s.Veg());
         s.NonVeg();
        
    }
}
