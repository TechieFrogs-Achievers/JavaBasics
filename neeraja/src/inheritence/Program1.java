package inheritence;

//parent class
class Parentt
{
    //parent class method
   // private
    void parentMethod()
    {
        System.out.println("This is  patent class");
    }
}

//chils class
class Child extends Parentt
{
    //child class method
    void childMethod()
    {
    System.out.println("This is child clas");
    }
}

public class Program1 
{
    public static  void main(String[] uh)
    {
        //objects are created for both child and parent classes
        Child ch=new Child();
        Parentt pt=new Parentt();

        //calling methods in both clases using references
        //The method parentMethod() from the type Parentt is not visible
        //shows error if parent method is made as private
        pt.parentMethod();
        ch.parentMethod();
        ch.childMethod();
      
    }
    
}
