 class Parent
     {
    void p1 () //method for parent class
    {
        System.out.println("this is parent class");
    }  
}
class Child extends Parent //child class aquring the properties of parent class
{
    void C1()  // method for child class
    {
        System.out.println("this is child class");
    }
}
class ClassMethod
{
    public static void main(String[] args) 
    {
        Parent p=new Parent();  //object creation for parent class
        p.p1();                 //parent object calling parent method
        Child c=new Child();   //  object creation for child class
       c.C1();                 // child object  calling child method
       c.p1();                 // child object calling parent method
    }
}
