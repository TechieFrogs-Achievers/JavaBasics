//package Inheritance;

//this is parent class
class ParentClass
{
    //method for printing parent class
    public void parentMethod()
    {
        System.out.println("This is parent class");
    }
}
//this is child class. chlid class acquire properties of parent class by using extends keyword
class ChildClass extends ParentClass
{
    //this is child method
    public void childMethod()
    {
        System.out.println("This is chlid class");
    }
}
public class InheritanceSampleExample 
{  
    public static void main(String[] args) {
        ParentClass p = new ParentClass();      //parent class object creation
        p.parentMethod();               //parent method calling by using parent class object
        ChildClass c = new ChildClass();        //child class object creation
        c.childMethod();                    //child method calling by using child class object
        c.parentMethod();                    //parent method calling by using child class object
    }   
}
