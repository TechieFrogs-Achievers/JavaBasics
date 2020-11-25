class A1 // parent class of A1()
{
  public static  void show() //static method for A1()
  {
    System.out.println("Parent");
  }
}
class B1 extends A1 //child class for B1()
{
    public static void show() // static method for B1()
    {
        System.out.println("Child");
    }
}
public class Method8 // main class
{
  public static void main(String[] args)
  {
    A1.show(); // static methods by classname of A1() class
    B1.show();// static method by classname of B1() class
    A1 obj=new B1();
    B1.show();

        
        
        
  }

}
    

