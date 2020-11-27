abstract class Parent
{
    abstract void message();

}
class SubClass1 extends Parent

{
    void message()
    {
        System.out.println("This is first sub class");
    }

}
class SubClass2 extends Parent
{
    void message()
    {
        System.out.println("This is second sub class");
    }

}
public class  Abstract1
{
    public static void main(String[] args) 

    {
        Parent p = new SubClass1();
        p.message();
        Parent p1= new SubClass2();
        p1.message();
       /* SubClass1 s = new Parent();
        s.message();*/


    }
}