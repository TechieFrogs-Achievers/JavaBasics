public class MethodProgram8 
{
   public static void main(String[] args) 
   {
      A obj1=new A();//create object for a class A
      B obj2=new B();//create object for a class B
      A.relation();//calling Static method
      B.relation();//calling Static method
      A obj=new B();
   } 
}
class A
{
    //satic method to print parent
    public static void relation()
    {
        System.out.println("parent");
    }
}
class B extends A
{
    //satic method to print child
    public static void relation()
    {
        System.out.println("child");
    }
}
