abstract class Animal
{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animal
{
    void cats()
    {
        System.out.println("cats meow");
     }
}
class Dogs extends Animal
{
    void dogs()
    {
        System.out.println("dogs bark");
    }
}
public class AbstractAnimal
{
    public static void main(String[] args)
     {
        Animal a=new Cats();
        a.cats();
        Animal b=new Dogs();
        b.dogs();
    }
}