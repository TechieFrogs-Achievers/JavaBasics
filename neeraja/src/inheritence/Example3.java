package inheritence;

//PARENT CLASS
class Parent 
{
    static int x;
    char ch;
     
     //static block
     static 
     {
         x=10;
         System.out.println(x);
     }
    //instance block
     {
         ch='A';
         System.out.println(ch);
     }
     //instance method
     public void parent()
     {
        System.out.println("inside instace method in super class");
     }
     //ststic method
     public static void function1()
     {
        System.out.println("inside static method in super class");
     }
}


//DERIVED CLASS
class Chaild extends Parent 
{
    static int y;
    float z;
     
     //static block
     static 
     {
         y=20;
         System.out.println(y);
     }
    //instance block
     {
         z=42.25f;
         System.out.println(z);
     }
     //instance method
     public void child()
     {
        System.out.println("inside instace method in child class");
     }
     //static method
     public static void function2()
     {
        System.out.println("inside static method in child class");
     }
}

public class Example3 
{
    public static void main(String[] gh)
    {
        //object creation for derived class
        Chaild cr=new Chaild();
        //instance method calls
        cr.parent();
        cr.child();

        //static method calls
        Chaild.function1();
        Chaild.function2();


    }
    
}
