package InheritanceDoc;
class Parent //parent class
{
    public void parentMethod()// parent class method 
    {
        System.out.println( "This is parent class");
    }  
}
class Child extends Parent //child class extends parent class
{
    public void childMethod()
    {
        System.out.println("This is child class");
    }
}

public class Program1 
{
    public static void main(String[] args) 
    {
        Parent p = new Parent();
        Child c = new Child(); 

        p.parentMethod();//parent object refernce calls parent method
        c.childMethod();// child object refrence calls child class method
        c.parentMethod();//child object refernce calls parent class method
    }
    
}
