package Abstract; // Package for own class
import Interface.InterfaceClass7; //Package for diff class
interface Sample //interface
{
    void show(); //method for interface
}

class Program7 implements Sample //class implementing interface
{
    protected class Sample1 
    {
       public void show()
       {
         System.out.println("Show methods");
       }
    }
    public static void main(String[] args) {
        Sample1 p7=new Sample1();
        InterfaceClass7 i7=new InterfaceClass7();
        i7.display();
        p7.show();
    }

}
