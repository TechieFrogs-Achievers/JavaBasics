class A1
{
    //cerating method 
    public  static void  demo()
   {
      System.out.println("parent");
   }
    
}
//sub class
class B1 extends A1
{   
    // creating method
    public  static void  demo()
    {
        System.out.println("Child");
    }
}
public class Method8
{
    public static void main(String[] args) 
    {   
        // creating object 
        A1 objectA1 = new B1();
        B1.demo();// calling method

        
    }
}
