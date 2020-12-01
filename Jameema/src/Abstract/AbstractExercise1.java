package Abstract;
abstract class parent //abstract class
{
    abstract void Message(); //abstract method 
}
class child extends parent //inherits abstract class details
{
    void Message() //method
    {
        System.out.println("this is first subclass");

    }

}
class child1 extends parent //inherits abstract class details
{
    void Message()
    {
        System.out.println("this is second subclass");
    }
}

public class AbstractExercise1
 {
    // void Message()
    // {
    //     System.out.println("this is abstract class");
        
    // }
     public static void main(String[] args) 
     {
        // AbstractExercise1 a  = new AbstractExercise1();
         parent p = new child(); //upcasting
         parent p1 = new child1();
         p.Message(); //calling method
         p1.Message();
         //a.Message();
        
         
     }
    
}
