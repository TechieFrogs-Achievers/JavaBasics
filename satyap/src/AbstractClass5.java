abstract class Animals // Abstract Class as Animal
{
    abstract void cats(); // Abstract Method1
    abstract void dogs();// Abstract Method2
}
class Cats extends Animals // Subclass1
{
    void cats() // Abstract method1
    {
       System.out.println("Cats meow");
    }
   /* void dogs()
    {

    }*/
}
class Dogs extends Animals // Subclass2
{
    void dogs() // abstract method2
    {
       System.out.println("Dogs bark");
    }
    /*void cats()
    {

    }*/
}
public class AbstractClass5 // Driver class
{
    public static void main(String[] args)
    {
         Animals c=new Cats(); // upcasting  for Cats class
         c.cats(); // method call for cats()
         Animals d=new Dogs(); // upcasting for Dogs class
         d.dogs(); // method call for dogs()
    }

} 


