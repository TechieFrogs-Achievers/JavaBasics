package Abstract;
abstract class Example
{
     Example()
     {
         System.out.println("This is constructor of abstract class");
     }
    abstract void a_method();

    void non_abstract()
    {
        System.out.println("this is non abstract method");
    }

}

public class AbstractExercise4 extends Example
 {
    
     void a_method()
     {
         System.out.println("this is abstract method");
     }
    
     public static void main(String[] args) 
     {
         Example e = new AbstractExercise4();
         e.a_method();
         e.non_abstract();
         
     }
    
}
