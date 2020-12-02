package Interface;
interface Interface//interface name same as package name
{
    void demo();//abstract method
}
public class InterfaceExample6//outer class
{
    public class Innerclass implements Interface// inner class implements from classes
    {
       public void demo()
        {
            System.out.println(" inner classes");
        }

    }
    public static void main(String[] args)
    {
        InterfaceExample6 i = new InterfaceExample6();// creating object for outer class
        InterfaceExample6.Innerclass obj = i.new Innerclass();// creating object for inner class 
        obj.demo();// calling method with inner class object
    }
}
 

    
