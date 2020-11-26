class A 
{
    static void myMethod ()
    {
        System.out.println("Parent");
    }
}
class B extends A
{
    static void myMethod()
    {
        System.out.println("Child");
    }
}
public class Method8
{
    public static void main(String []args)
    {
        A a = new A ();
        B b = new B ();
        A c = new B ();
        a.myMethod();
        b.myMethod();
        c.myMethod();
    }
}
