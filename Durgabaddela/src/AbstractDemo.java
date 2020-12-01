abstract class Test
{
    static void Method(char c)//static  method
    {
       System.out.println("static method ");
    }
     void Method()//concrete method
    {
       System.out.println("concrete method");
    }
    final void Method(int n)//concreate method
    {
       System.out.println("final method");
    }
    abstract  void MyMethod();
 }
 class Demo extends Test
 {
 
    public void MyMethod()
    { 
         System.out.print("Abstract method"); 
    }
}
public class  AbstractDemo
{
    public static void main(String args[])
    { 
       //error: You can't create object of it
       //AbstractDemo obj = new AbstractDemo();//cannot create object for abstract class
       //obj.anotherMethod();
       Test t = new Demo();
       Test.Method('d');
       t.Method();
       t.Method();
       t.MyMethod();
    }
 }    

