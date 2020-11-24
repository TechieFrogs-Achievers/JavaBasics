package inheritence;

//TO UNDERSTAND BASIC CONCEPT OF INHERITENCE
class Simple
{
    int a=10;

    //static method
    static void division()
    {
        System.out.println("division method");
    }


   // private void factor()
    protected void factor()
    {
        System.out.println("hello");
    } 
}

class Sample extends Simple
{
     int b=10;

     //specialised method
    public int add()
    {
       factor();//inherited method
       int x=10, y=20;
       int  c=x+y;
       return c;
    }
  // super.factor(); 
}

public class Example1 
{
    public static void main(String[] args)
    {
        //object for class Sample
        Sample s=new Sample();
        System.out.println("a value is :"+s.a);
        System.out.println("b value is :"+s.b);

        //calling methods in both base and derived classes
        s. factor();
        int z=s.add();
        System.out.println("addition of x and Y is :"+z);

     }
    
}
