package abstraction;

//abstract class
abstract class Abstract{

    public Abstract(){//super class constructor
        System.out.println("This is constructor of abstract classs ");
    }
    abstract void a_method();//abstract method

    public void non_abstract(){//concrete method
        System.out.println("This is a normal method of abstract class" );
    }
}

///subclass implementing body for abstract method
 class NonAbstract extends Abstract {
       /*public NonAbstract(){
       super(3,4);
       }*/

    public void a_method(){//implementation of abstract method
        System.out.println("This is abstract method");
    }
}

public class ExcersiceFour{
    public static void main(String[] tf)
    {
        //instantiation of bankA using parent class reference
        NonAbstract n=new NonAbstract();
        n.a_method();//calling abstract method using  reference
        n.non_abstract();//calling non abstract method using  reference

    }

}
