package Packages;
import Interface.interfaceExample7;
import AbstarctClasses.InterfaceExampleProgram7;

public class InterfaceExample7 extends InterfaceExampleProgram7
{
    //method for creating object of inner class
    public void display1()
    {
        InterfaceExampleProgram7 i = new InterfaceExampleProgram7();            //object creation for outer class in abstract package
        i.display();                                    //outer class method calling 
        // i.example();
        example7 e =  new example7();                       //object creation for inner class
        e.example();
        //upcasting for interface
        interfaceExample7 s = new example7();
        s.example();

    }
    public static void main(String[] args) {
        InterfaceExample7 i = new InterfaceExample7();                  //object creation for this class
        i.display1();                   //method calling
    }
    
}
