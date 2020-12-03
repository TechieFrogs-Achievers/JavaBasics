abstract class Parent1 
{
    abstract void message() ;  
}
class Subclass1 extends Parent1
{
    void message()
    {
        System.out.println("This is first class");
    }
}
public class Abstract1 extends Parent1
{
    void message()
    {
        System.out.println("This is second class");
    }
    public static void main(String[] args)
    {
        Subclass1 sc1 = new Subclass1();
        Abstract1 a1 = new Abstract1();
        sc1.message();
        a1.message();
    }
}

