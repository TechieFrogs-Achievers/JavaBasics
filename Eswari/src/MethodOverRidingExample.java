//method overloading
class Eswari
{
    //method for int
    public void method(int a)
    {
        System.out.println("The value is " +a);
    }
    //method for float
    public void method(float b)
    {

        System.out.println("The float value is " +b);
    }
    
}

public class MethodOverRidingExample {
    public static void main(String[] args) {
        Eswari m = new Eswari();                //object creation
        m.method(5);
        //m.method(2.6f);
    }
}
