package Interface;

//interface creation
interface sample
{
    //abstract method declaration
    public void display();
}
//outer class creation
class OuterClass 
{
    //normal method
    public void display1()
    {
        System.out.println("Outer class.....");
    }
    //inner class creation
    class Sample1 implements sample
    {
        //interface method implemntation
        public void display()
        {
            System.out.println("Interface implementation in Inner class...");
        }

    }
}
public class Example8
{
    public static void main(String[] args) {
        OuterClass e = new OuterClass();
        e.display1();
        //Sample1 s = new Sample1();
        //inner class object creation : - outerclass.innerclass innerobj = outerobj.new innerclass()
        OuterClass.Sample1 s = e.new Sample1();
        s.display();                            //method calling

    }


}
        

