abstract class Parent4 // abstract class as Parent4
{
    Parent4() // constructor for Parent
    {
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method(); // Abstract method
    public void method() // Non Abstract method
    {
        System.out.println("This is a normal method of abstract class");
    } 
}
class SubClass extends Parent4 // Subclass1
{
    void a_method() // extending Abstract method
    {
        System.out.println("This is abstract method");
    }
} 
class AbstractClass4 // Driver class
{
    public static void main(String[] args) {
        Parent4 p=new SubClass(); // upcasting for Subclass
        p.a_method(); // method calling for abstract method
        p.method(); // method calling for non abstract method
    }
}
