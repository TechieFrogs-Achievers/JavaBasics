package AbstractExercises;
// parent class
abstract class Parent 
{    
    // abstarct method 
    abstract void  Method();//default
    
}
// child class  
class Subclass1 extends Parent// inheriting  properties from abstract class
{
    void Method()// Method
    {
        System.out.println("This is first subclass");//printing

    }

}
class Subclass2 extends Parent//another child class
{

    void Method ()//Method
    {
        System.out.println("This is Second subclass");// printing
    }
        
    
}
public class AbstractProgram1
{
    public static void main(String[] args)
    {  
        
      Subclass1 s1 = new Subclass1(); // creating object for  1st sub class
      s1.Method();// calling method with object
      Subclass2 s2 = new Subclass2();// creating object for 2nd sub class
      s2.Method();//calling method with object


    }
}
