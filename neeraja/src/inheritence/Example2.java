package inheritence;

//TO OBSERVE CONSTRUCTOR CHAINING IN INHERITENCE
//super class/parent class
class Inherit
{
    //default constructor
    public Inherit()
    {
    }
    
   //base class constructor
    public Inherit(String string)
    {
        this();
        System.out.println("inside inherit constructor");
    }

   
}

//chid class or derived class
class Base extends Inherit
{

    //constructor one
    public Base(int i, int j)
    {
        this();
        System.out.println("inside base  constructor");
    }

    //constructor two
    public Base() 
    {
        super("Techifrogs");
        System.out.println("inside base  constructor one");

	}

}

public class Example2
{
    public static void main(String[] ard)
    {
      Base b=new Base(1,2);


    }
    
}
