package AbstractClasses;

//abstract class
abstract class Test{
    //constructor
    Test(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method(); //absract method

    //Normal method
    void normalMethod(){
        System.out.println("This is a normal method of abstract class");
    }
}
//subclass
class Subclass extends Test{
    //abstraction method implementation
    void a_method(){
        System.out.println("This is abstract method");
    }
}
public class AbstractExcercise4 {
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.a_method(); //calling the abstract method
        s.normalMethod();  //calling the normal method
    }
}
