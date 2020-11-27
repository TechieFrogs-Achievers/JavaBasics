package AbstractionExamples;

abstract class Parent //abstract class
{
    abstract void method();//abstract method
} 

class Child1 extends Parent //sub class 1
{
    void method()//implementation of abstract method
    {
        System.out.println("This is first sub calss");
    }
} 

class Child2 extends Parent //sub class 2
{
    void method() //implemaentation of abstrat method
    {
        System.out.println("This is second sub class");
    }
}
public class Program1 
{
    public static void main(String[] args)
    {
        Child1 c = new Child1(); //object for subclass1
        c.method();
        Child2 c2 = new Child2();//object for subclass 2
        c2.method();
        
    }
    
}
