package Methods;

//super class 
class A
{
    //static method for printing parent
    public static void display()
    {
        System.out.println("Parent");
    }
}

//sub class
class B extends A
{
    //static method for printing parent
    public static void display()
    {
        System.out.println("Child");
    }
}
public class MethodExample7 
{
    public static void main(String[] args) 
    {
        A a = new A();              //object creation for parent class
        a.display();                 //parent method calling by parent object
        B b = new B();                //object creation for child class
        b.display();
        A aa = new B();
        aa.display();

    }
    
}
