abstract class Example
{
    abstract void a_method();       //abstract method

    public Example()        //constructor of abstract class
    {
        System.out.println("This is constructor of abstract class");
    }
    public void display()       //non abstract method
    {
        System.out.println("This is normal method of abstract class");
    }
}
class SubClass extends Example
{
    void a_method()     //implementation of abstract metod
    {
        System.out.println("This is abstract method");
    }
}


public class Abstract4 
{
    public static void main(String[] args)
     {
         SubClass sc = new SubClass();  //creating an object for subclass
         sc.a_method();     //method calling
         sc.display();
        
    }
    
}
