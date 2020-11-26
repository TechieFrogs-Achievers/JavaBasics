// Creating parent class
private class Parent
{
    public void pMethod()
    {
        System.out.println("This is Parent Class");
    }
}
// Creating child class
class Child extends Parent
{
    public void cMethod()
    {
        System.out.println("This is Child class");
    }
}
class ParentChild extends Parent
{
    public static void main(String[] args)
    {
        Parent p = new Parent ();
        Child c = new Child ();
        p.pMethod();
        c.cMethod();
        c.pMethod();
    }
}
