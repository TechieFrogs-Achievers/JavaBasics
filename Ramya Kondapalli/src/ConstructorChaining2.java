//import sun.tools.serialver.resources.serialver;

class Test1{
    //int 
    public Test1()
    {
      //it will call one paramerised constructor
      this(9);
      System.out.print("In default Constructor");  
    }
    {
        //it is instance block
        //it will execute when the object is created
        //it will exceute at the starting 
        System.out.println("User Details");
    }
    public Test1(int x)
    {
        //it will call two parametrised constructor
        this("ramya",34);
        System.out.println("in one parametrised ");
    }
    public Test1(String s,int x)
    {
        //this(43);
        System.out.println(s + " " + x);
    }
}
public class ConstructorChaining2 {
    public static void main(String[] args) {
        Test1 t = new Test1();//calling default constructor
        
    }
}
