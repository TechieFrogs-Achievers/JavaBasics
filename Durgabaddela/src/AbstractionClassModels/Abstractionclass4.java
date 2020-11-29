package AbstractionClassModels;
abstract class Demo//abstractclass
{
    public Demo()//constructor
    {
        System.out.println("this is constructor of a abstract class");
    }
    public void method()//normal method of an abstract class
    {
        System.out.println(" this is normal method of an abstract class");
    }
    public abstract void a_method();//abstract method
}
//subclass inherites the parent class

class SubClass extends Demo
{
    public void a_method()//override abstract method
    {
        System.out.println("this is abstract method");
    }
}
public class Abstractionclass4 
{
    public static void main(String[] args)
    {
        Demo d = new SubClass();//object for subclass
        d.a_method();//calling abstract method
        d.method();//calling normal method

    }
}
