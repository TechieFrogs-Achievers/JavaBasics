package AbstarctClasses;

//abstract class
abstract class AbstractClass
{
    //constructor
    AbstractClass()
    {
        System.out.println("This is constructor of abstract class");
    }
    //abstract method
    abstract void  a_method();
    //non-abstract method
    public void method()
    {
        System.out.println("This is normal method of abstract class");
    }
}
//child class
class SubClass extends AbstractClass
{
    //abstract method implementation
    void a_method()
    {
        System.out.println("This is abstract method");
    }
}
public class Example4 
{
    public static void main(String[] args) {
        SubClass sb = new SubClass();           //object creation for sub class
        sb.a_method();                           //calling abstract method 
        sb.method();                                //calling normal method
    }
    
}
