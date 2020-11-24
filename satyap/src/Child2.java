class Parent // using inheritance ofParent class
{
   private void p1() // method for parent class
    {
        System.out.println("Parent class");
    }
    
}
class Child2 extends Parent // child class as Child2
{
    void show() // method for class class
    {
        System.out.println("Child class");
    }
    public static void main(String[] args)
    {
       // Parent p=new Parent();
       // p.display();
        Child2 c=new Child2(); // object for child class
        c.show(); // method calling for child class
        
    }
}
