package AbstractionExamples;
abstract class Parent1 //abstract class
{
   public Parent1() //constructor without any parameters
    {
        System.out.println("This is constructor of abstract class");
    } 
    abstract void  a_method(); //abstract method

    void b_mehod() //non abstract method
    {
        System.out.println("This is normal method of abstract class");
    }
}  

class SubClass extends Parent1
{
    void a_method()//abstract method implementation
    {
        System.out.println("abstract method");
    }
}  

public class Program4 
{
    public static void main(String[] args) 
    { 
        //obj creation
        SubClass sb = new SubClass();
            sb.a_method();
            sb.b_mehod();
        
    }
    
}
