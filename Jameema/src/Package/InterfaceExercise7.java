package Package;
import Interfce.MyPack; //importing interface package and mypack interface
import Abstract.InterfaceSample; //importing abstract package and InterfaceSample class

public class InterfaceExercise7 extends InterfaceSample //inherits the interfaceSAmple class details
{
    public void Remo() //creating method
    {
        Sampleclass s = new Sampleclass(); //creating object to nestedclass
        s.Demo(); //calling method by using nested class object
        MyPack m = new Sampleclass(); //upcasting to nestedclass
        m.Demo(); //calling method ny using upcasting object
    }
    public static void main(String[] args)
     {
         InterfaceExercise7 z = new InterfaceExercise7(); //creating object 

        z.Remo(); //calling ethod
    }
}


