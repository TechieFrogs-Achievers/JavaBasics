public class AbstractExcercise4 
{
   public static void main(String[] args)
   {
      ExampleAbstract ae=new SubclassExample();//object create
      ae.a_method();//calling abstract method
      ae.nonAbstract(); //calling non abstract method
   } 
}
abstract class ExampleAbstract//abstract calss
{
    ExampleAbstract()//constructor
    {
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();//abstract method
    public void  nonAbstract()//non abstract method
    {
        System.out.println("This is a normal method of abstract class");
    }
}
class SubclassExample extends ExampleAbstract//sub class of abstract class
{
    void a_method()
    {
        System.out.println("This is abstract method");
    }
}