public class AbstractExample 
{
   public static void main(String[] args) 
   {
      Base b=new Derived();
      b.fun();
      b.show();
      b.sample();
     // b.number=12;
      //System.out.println(b.number);
      //Base b1=new Base();
      //b1.show();
      
   } 
}
abstract class Base//abstract class
{
        //int number;
        Base()
        {
            System.out.println("Base constructor");
        }
    abstract void fun();
    public void show()
    {
        System.out.println("non-absract method");
    }
    final void sample()
    {
        System.out.println("final method");
    }
    
} 
class Derived extends Base//inherit the abstract class to Derived class
{
    Derived()
    {
         System.out.println("Derived Constructor");
    }
     void fun()
     {
         System.out.println("Derived class");
     }   
    /* public void show()
     {
         super.show();
         System.out.println("child class");
     }*/
   
}
