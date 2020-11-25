class parent
{
    public void parent1()//creating method for parent class
    {
        System.out.println("this is a parent class");
    }
}
class Child extends parent    //inheriting parent class from child class
{
    void Child1() //creating method for child class
    {
        System.out.println("this is a child class");
    }
}
public class ParentChild1  // calling the main class 
{
    public static void main(String[] args) 
    {
        parent p = new parent(); //creating object to parent class
        p.parent1();
        Child c = new Child(); //creating object to child class
        c.Child1(); //child object calling the child method
        c.parent1(); //child object calling parent method
        
    }
}
















    
