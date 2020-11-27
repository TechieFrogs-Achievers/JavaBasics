package AbstractClasses;
//absract class
abstract class Parent{
abstract void message(); //absract method
}
class Child1 extends Parent{
    //abstract method implementation
    void message(){
        System.out.println("This is first sub class");
    }
}
class Child2 extends Parent{
    //abstract method implementation
    public void message(){
        System.out.println("This is second sub class");
    }
}
public class AbstractExcercise1 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        c1.message();
        c2.message();
    }
}
