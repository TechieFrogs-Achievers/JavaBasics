package AbstarctClasses;

//Abstract class
abstract class Parent
{
    //this is abstract method
    abstract void message();

}

//first sub class
class Child1 extends Parent
{
    //abstract method implementation
    void message()
    {
        System.out.println("This is first sub class");
    }
}

//child class
class Child2 extends Parent
{
    ////abstract method implementation
    void message()
    {
        System.out.println("This is second sub class");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Parent p = new Child1();                //sub class1 object creation and also upcasting
        p.message();                            //method calling
        Child2 c = new Child2();                //sub class2 object creation
        c.message();                             //method calling
        //Parent pa = new Parent();
    }
    
}
