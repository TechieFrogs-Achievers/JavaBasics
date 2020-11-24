public class InheritanceExample2 
{
    public static void main(String[] args) 
    {
      Parent1 p=new Parent1();//object creation for parent class
      p.display();//method calling error
      Child1 c= new Child1();//object creation for child class
      c.show();//method calling
      c.display();//error because method should be in private
    }
}
//parent class
class Parent1
{
    //method for disply
  private void display()
  {
      System.out.println("This is parent class");
  }
}
//child class
class Child1 extends Parent1
{
    //method for child class
    public void show()
    {
        System.out.println("This is child class");
    }
}