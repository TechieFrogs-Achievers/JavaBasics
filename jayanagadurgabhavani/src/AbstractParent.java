abstract class Parent
{
    abstract void message();//methode
}
class Parent1 extends Parent//class extend
{
   void message()//methode
   {
       System.out.println("this is the first subclass");
   }
}
  class Parent2 extends Parent//class extend
  {
      void message()//methode
      {
          System.out.println("this is the second subclass");
      }
  }  
public class AbstractParent
{
    public static void main(String[] args) 
    {
        Parent p=new Parent1();
        p.message();
        Parent pa=new Parent2();
        pa.message();
    }
}
