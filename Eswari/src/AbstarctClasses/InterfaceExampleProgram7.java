package AbstarctClasses;
import Interface.interfaceExample7;


public class InterfaceExampleProgram7 
{
    //outer class method
    public void display()
    {
        System.out.println("Outer class method");
    }
    //inner class creation
    protected class example7 implements interfaceExample7
    {
        //constructor
        public example7()
        {

        }
        //interface method implemntation
        public void example()
        {
            System.out.println("Interface implementation in Inner class");
        }
    }
    
}

    

