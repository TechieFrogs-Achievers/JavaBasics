public class AbstractExcercise5 
{
    public static void main(String[] args) 
    {
        Animals a=new Cats();//object creation
        a.cats();//method calling
        Animals d=new Dogs();//object creation
        d.dogs();//method calling
    }
}
abstract class Animals//parent class
{
    abstract void cats();//method for cats
    abstract void dogs();//method for dogs
}
class Cats extends Animals//subclass of abstract class
{
    void cats()
    {
        System.out.println("Cats meow");
    }
}
class Dogs extends Animals//subclass of abstract class
{
    void dogs()
    {
        System.out.println("Dogs bark");
    }
}