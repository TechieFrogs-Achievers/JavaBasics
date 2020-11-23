class parent1
{
    private void parent()//creating method for parent class
    {
        System.out.println("this is a parent class");
    }
}
class Child1 extends parent    //inheriting parent class from child class
{
    void Child() //creating method for child class
    {
        System.out.println("this is a child class");
    }
}
public class ParentChild2  // calling the main class 
{
    public static void main(String[] args) 
    {
        parent1 p = new parent1(); //creating object to parent class
        //p.parent(); //As we assigned parent class private so it occurs parent1 not visible
        Child1 c = new Child1(); //creating object to child class
        c.Child(); //child object calling the child method
        //c.parent(); //child object calling parent method
        
    }
}



    

