package AbstractExercises;
//Abstract class
abstract class Constructor
{
    Constructor()
    {
        System.out.println("This is constructor of abstract class");

    }
    abstract void a_Method();//abstract method
    // non abstract method
    void non_Method()
    {
        System.out.println("This is normal method of abstract class");
    }

}
// sub class
class Childconstructor extends Constructor// inheriting properties from constructor
{
    void a_Method()// method
    {
        System.out.println("This is abstract method");

    }

}
// main class
public class AbstractProgram4
{
    public static void main(String[] args) 
    {   
        // upcasting
        Constructor c = new Childconstructor();
        c.a_Method();//calling method 
        c.non_Method();//calling method
        
    }
}
    

