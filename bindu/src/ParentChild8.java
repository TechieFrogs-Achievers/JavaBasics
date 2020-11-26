class A2
{
    public static void show()  //creating static method to print the parent
    {
        System.out.println("parent:");
    }
}
class B2 extends A2  //subclass inherits the parentclass
{
    public static void show()
    {
        System.out.println("child:");
    }
}
public class ParentChild8    //calling the main claa
{
    public static void main(String[] args) 
    {
        A2 objA = new B2();    //creating object for parent class and refering the subclass
        B2.show();

    }
    
}
