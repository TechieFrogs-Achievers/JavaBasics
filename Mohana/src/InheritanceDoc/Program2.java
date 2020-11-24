package InheritanceDoc;

  class Parent1 //parent class
{ 

    private void parentMethod()// parent class method 
    {
        System.out.println( "This is parent class");
    }  
}
class Child1 extends Parent1 //child class extends parent class
{
    public void childMethod() //child class method
    {
        System.out.println("This is child class");
    }
}
public class Program2
{
    public static void main(String[] args) 
    {
        Parent1 p = new Parent1();
        Child1 c = new Child1(); 

       // p.parentMethod();//parent object refernce calls parent method 
        //It throws an error because method is priate means that it can access with  with in the class only

        c.childMethod();// child object refrence calls child class method

        //c.parentMethod();  it also throws an error because of private method
    }
}
