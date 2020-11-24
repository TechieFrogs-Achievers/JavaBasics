package Inheritance;

//parent class creation
class Parent
{
    //parent classes method
    private void parentMethod()
    {
        System.out.println("This is parent class");
    }
}

//parent class properties acquiring using extends keyword
class Child extends Parent
{
    //child classes method
    public void childMethod()
    {
        System.out.println("This is child class");
    }
}

public class InheritanceSampleExample2 
{
    public static void main(String[] args) {
        Parent p = new Parent();        //parent class object creation
        //p.parentMethod();               //compile time error because parent method is private
        Child c = new Child();          //child class object creation
        c.childMethod();                //child method calling by using child class object 
        //c.parentMethod();               //compile time error because parent method is private

    }
    
}
