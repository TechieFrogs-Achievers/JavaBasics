public class InheritanceExample1 
{
    public static void main(String[] args)
    {
      Parent p=new Parent();//object creation for parent class
      p.display();//method calling
      Child c= new Child();//object creation for child class
      c.show();//method calling
      c.display(); //method of parent class by object of child class 
    }
}
//parent class
class Parent
{
    //method for disply
  public void display()
  {
      System.out.println("This is parent class");
  }
}
//child class
class Child extends Parent
{
    //method for child class
    public void show()
    {
        System.out.println("This is child class");
    }
}