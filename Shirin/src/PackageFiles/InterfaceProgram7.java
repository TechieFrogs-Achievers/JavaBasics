package PackageFiles;
import InterfaceExercise.NewPack;
import AbstractExercises.Newinterface;


public class InterfaceProgram7 extends Newinterface
{
    void demo2()
    {
        Nestedclass n = new Nestedclass();
        n.Pack();
        n.demo();
        NewPack obj = new Nestedclass();
        obj.Pack();
    }
    public static void main(String[] args)
    {
        InterfaceProgram7 i = new InterfaceProgram7();
        i.demo2();
        
    }
    
}
