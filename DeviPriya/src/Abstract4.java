abstract class Abstract
{
    Abstract()
    {
        System.out.println("This is a constructor of Abstract class");
    }
    abstract void a_Method();
    void a_method()
    {
    System.out.println(" This is a normal method of abstract class");
    }
}
class Child2 extends Abstract{
    void a_method()
    {
        System.out.println(" This is  abstract method");
 }

}
public class Abstract4 {
    public static void main(String[] args) 
    {
        Child2  s= new Child2();
        s.a_method();
        //Child2 s1 = new Abstract();

    }
}
