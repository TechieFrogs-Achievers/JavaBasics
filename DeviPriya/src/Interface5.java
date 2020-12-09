//package Interfce;

interface FastFood
{
    public String Vegetarian();
    public void NonVegetarian();
}

 class Sandwich implements FastFood
{
    public String Vegetarian()
    {
        return ("this is veg sandwich");
    }
    public void NonVegetarian()
    {
        System.out.println("this is Nonveg sandwich");
    }
}
 public class  Interface5
 {
    public static void main(String[] args)
     {
         Sandwich s = new Sandwich();
         System.out.println(s.Vegetarian());
         s.NonVegetarian();

    }
}

