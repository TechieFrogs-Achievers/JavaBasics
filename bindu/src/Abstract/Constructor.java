package Abstract;

abstract class Constructor 
{
    Constructor()    //creating the constructor
    {
        System.out.println("this is a constructor of abstract class: ");
    }
    abstract void a_method();    //creating abstract method
     void a_class()    //without the abstract 
    {
        System.out.println("this is normal method of abstract class: ");
    }
}
class Program  extends Constructor   //subclass inherits the parent class
{
    void a_method()
    {
        System.out.println("this is abstract method:");
    }
    public static void main(String[] args)
     {
        Program c = new Program();   //creating the object for the subclass
         c.a_method();
         c.a_class(); //calling the methods
        
    }

}

    

