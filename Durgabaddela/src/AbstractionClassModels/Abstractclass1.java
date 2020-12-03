package AbstractionClassModels;
abstract class Parent//abstract class
{
    //method as message
  void message()
  {
      System.out.println("im in abstract class");
  }
}
//subclass extends parent

class Child extends Parent
{
    void message()//override method
    {
        System.out.println("this is first subclass");
    }
}
// another subclass extends parent

class Child1 extends Parent
{
    void message()//override method
    {
        System.out.println("this is second subclass");
    }
}
public class Abstractclass1 
{ 
    public static void main(String[] args)
    {
    Parent p = new Child();//creating obeject for subclass
    p.message();//calling method
    Parent a = new Child1();//creating obj for another subclas
    a.message();//calling second subclass method
    }
}
