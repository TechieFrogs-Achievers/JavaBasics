abstract class Constructor //abstract class 
{
    void a_Method() //non-abstract method
    {
        System.out.println("this is normal method");
    }
    Constructor() // constructor
    {
    System.out.println("this is constructor abstract class:");
    }
    abstract void a_method(); //abstract method 
}
class Abstract1 extends Constructor //parent class accesing propertues from abstract class 
{
    void a_method() // method for parent class
    {
        System.out.println("this is  abstract class");
    }
}
class AbstractClassConstructor
{
    public static void main(String[] args) 
        {
          //  Abstract1 c=new Constructor(); //object created 
           //c.a_Method();
            Abstract1 a=new Abstract1(); //object created for parent class 
            a.a_Method(); //method called with parent object
            a.a_method(); //method called with parent object
        }
                
            }