package Abstract;

abstract class Parent1  //using the abstract keyword to the parent class
{
    abstract void message();      //creating method by using the abstract keyword
}
class Father extends Parent1    //childclass inherits the parent class
{
    void message()
    {
    System.out.println("this is first subclass:");    //prints the value of subclass
    }
}
class Mother extends Parent1
{
    void message()
    {
        System.out.println("this is second subclass:");
    }

public static void main(String[] args) 
{
    Parent1 p = new Father();     //creating object for the parent class and calling the subclass(upcasting)
    Parent1 p1 = new Mother();
    p.message();        //calling the subclass with the object
    p1.message();
    
}
}