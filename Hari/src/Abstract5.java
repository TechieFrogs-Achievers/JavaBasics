abstract class Animals 
{
    abstract void cats();
    abstract void dogs();   
}
class Cats extends Animals
{
    void cats()
    {
        System.out.println("Cats meow");
    }
}
class Dogs extends Animals
{
    void dogs()
    {
        System.out.println("Dogs bark");
    }
}
class Abstract5 
{
    public static void main(String[] args)
    {
        Cats c = new Cats();
        Dogs d = new Dogs();

    }
}
