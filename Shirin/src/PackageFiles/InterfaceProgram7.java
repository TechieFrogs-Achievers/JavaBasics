package PackageFiles;// New package
import InterfaceExercise.NewPack;// interface pakage 
import AbstractExercises.Newinterface;// Abstract package


public class InterfaceProgram7 extends Newinterface// inheriting properties
{
    void demo2()// new method 
    {
        Nestedclass n = new Nestedclass();// creating object for inner class
        n.pack();
        n.demo();
        NewPack obj = new Nestedclass();// creating object for interface // upcasting
        obj.pack();
    }
    public static void main(String[] args)
    {
        InterfaceProgram7 i = new InterfaceProgram7();// creating object 
        i.demo2();// calling main class method
        
    }
    
}
