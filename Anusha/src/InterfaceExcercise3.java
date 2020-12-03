public class InterfaceExcercise3 
{
   public static void main(String[] args) 
   {
    Sandwich s = new Sandwich();//object creation
    System.out.println(s.Vegetarian());//print satament
    s.NonVegetarian();//calling method

   } 
}
interface FastFood//base interface
{
    public String Vegetarian();
    public void NonVegetarian();
}

 class Sandwich implements FastFood//implemented base class
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
 