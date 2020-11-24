class Test{
    private  Test()
    {
        //default constructor 
        System.out.println("In Default constructor");
    }
    private Test(int x)
    {
        //it will call default constructor
        this();
        System.out.print("In One parametrised : ");
        System.out.println(x);
    }
    public  Test(int x,int y)
    {
        //it will call one parametrised constructor
        this(5);
        System.out.print("In two parametrised :");
        System.out.println(x*y);
    }
}
public class ConstructorChaining1 {
    public static void main(String[] args) {
        Test t= new Test(5,6);
        //Test t1 = new Test(9);
        //we cant call a private constructor 
        //but we can access private constructor by using this keyword with in same class

    }
}
