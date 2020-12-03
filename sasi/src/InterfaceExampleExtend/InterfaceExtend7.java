package InterfaceExampleExtend;
//import Abstract.Interface7Example;
import Interface.Interface7;
import Abstract.Interface7Example;
//import Abstract.InterfaceExample;

public class InterfaceExtend7  extends Interface7Example
{
    void show()
    {
       // System.out.println("package returned");
       InterfaceExample e=new InterfaceExample();
      e.pack();
      Interface7 t=new InterfaceExample(); //upcasting
      t.pack();
    }
public static void main(String[] args)
 {
    InterfaceExtend7 i=new InterfaceExtend7();
    i.show();
}
}
