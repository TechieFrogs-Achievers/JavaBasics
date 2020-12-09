package Methods;

class A1
{
     static void Method() //parent class method
    {
        System.out.println("Parent");
    }
}
class B1 extends A1 //inherits parent class details
{
    static void Method()
    {
        System.out.println("Child"); //child class method
    }
}
public class MethodExercise8
 {
     public static void main(String[] args) 
     {
         A1 obj = new B1(); //creating object to parent class
         B1.Method(); //calling method using object
         
     }
    
}
