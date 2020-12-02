package InterfaceExercise;
//interface class 
 interface Pack
 {
      public void demo();// methods
      public void demo1();
      public void demo2();

 }
 //  child class
public class InterfaceProgram3 implements Pack
{
    public void demo()
    {
        System.out.println("This is interface package");
    }
    public void demo1()
    {
        System.out.println("This is second package");
    }
    public void demo2()
    {
        System.out.println("This is Third package");
    }
    public static void main(String[] args)
    {
        Pack p = new InterfaceProgram3();//upcasting
        //calling child class  methods  with object
        p.demo();
        p.demo1();
        p.demo2();
    } 

    
}
