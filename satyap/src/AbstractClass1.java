abstract class Parent1 // abstract class 
{
    abstract void message(); // abstract method as message
}
class Child4 extends Parent1 // Child4 extends Abstractclass
{
    void message() // extending abstract class into childclass
    {
        System.out.println("This is a first subclass");
    }
}
class Child5 extends Parent1 // Child5 extends Abstractclass
{
    void message() // extending abstrat class into childclass
    {
        System.out.println("This is a second subclass");
    }
}
public class AbstractClass1 // driver class
{
   public static void main(String[] args)
   {
    Parent1 p=new Child4(); // obj creation and upcasting
    p.message(); // method calling for Child4 subclass
    Parent1 p1=new Child5(); // upcasting 
    p1.message(); //method calling for Child5 subclass

   }
}
