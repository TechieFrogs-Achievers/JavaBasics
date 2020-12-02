package Abstract; // Package packagename
import Interface.InterfaceClass3; // importing package 
public class Program3 //class
{
    void display() // method
    {
        System.out.println("Display method");
    }
    public static void main(String[] args)
    {
        Program3 p=new Program3(); //obj creation for program3
        p.display(); //method calling display()
        InterfaceClass3 i=new InterfaceClass3(); //obj creation for InterfaceClass3
        i.attendance(); // methods calling for class InterfaceClass3
        i.marks();
        i.percentage();

    }

} 
