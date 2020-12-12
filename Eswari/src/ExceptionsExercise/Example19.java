package ExceptionsExercise;

//java class to handle classCloneException
class ParentClass
{
    public ParentClass()                //parentclass constructor
    {
        System.out.println("This is Parent class");
    }
}
//child class extending parent class
final class ChildClass extends ParentClass
{
    public ChildClass()                     //childclass constructor
    {
        super();                    //super method for calling parent class method
        System.out.println("This is child class");
    }
}
//driver class
public class Example19 
{
    public static void main(String[] args) 
    {
        ParentClass pc = new ParentClass();                 //object creation for parent class
        ChildClass cc = new ChildClass();                   //object creation for child class
        // cc = (ChildClass) pc;
        //try for exceptions in programs
        try{
            cc = (ChildClass) pc;                   //calling child class method
        }
        //catch for handling exceptions
        catch(ClassCastException ce)
        {
            System.err.println("ClassCastException is occured: ");
        }
        System.out.println("End of program");
    }
    
}
