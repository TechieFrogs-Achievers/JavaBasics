package Abstract;
import Interface.Interface6; // imported interface with class 

class Interface6import // class 
 { 
    void show()// class method 
    {
        System.out.println(" imported interface");
    }
}
 public class Interfacepublic 
{
    public static void main(String[] args) {
    Interface6import i=new  Interface6import(); // class object creation 
    i.show();// method calling with object of class
    Interface6 m=new Interface6();
    m.add1();
    m.add();
    m.sub1();
    m.sub();
    m.mult();
    m.show();
}
}
