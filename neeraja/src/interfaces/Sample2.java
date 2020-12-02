package interfaces;

//creating interface
interface FastFood
{
   //abstract methods
    public String Veg();
    public void NonVeg();
}

//child class implementing interace fastfood
class Sandwich implements FastFood
{
   //implementation of abstract method veg
    public String Veg()
    {
        return ("this is veg sandwich");
    }
    //implementation of abstract method nonveg
    public void NonVeg()
    {
        System.out.println("this is Nonveg sandwich");
    }
}
//main class
public class Sample2
{
    public static void main(String[] args)
     {
        //instantiation of child class
         Sandwich s = new Sandwich();
         System.out.println(s.Veg());
         s.NonVeg();
        
    }
}


