package Interface;

//import Abstract.InterfaceExample;

//public class Interface6 {
    interface Add  // class interface 
    {
        void add(); // non-abstract method for class 
        void add1();
    }
    interface Sub
    {
        void sub();
        void sub1();
    }
    interface Mult
    {
        void mult();
        void mult1();
    }
    interface Div extends Add,Sub,Mult //interface extends another interface class 
    {
        void show();
    }
    public class Interface6 implements Div // parent class  extends interface class 
    {
      public void show() // method for parent class
     {
        System.out.println("this is an interface");
      }
      public void mult()
      {
          System.out.println(" multiplying is done");
      }
      public void mult1()
      {
          System.out.println(" multiply ");
      }
      public void  sub()
      {
          System.out.println(" substraction");
      }
      public void sub1()
      {
          System.out.println(" substraction is done");
      }
      public void add()
      {
          System.out.println(" Addition is done");
      }
      public void add1()
      {
          System.out.println(" Added a number");
      }
    //}
   // class Interface6{
    public static void main(String[] args) 
    {
        Interface6 m=new Interface6(); //created an object for class 
        m.add1(); // calling method with class object  
        m.add(); 
        m.sub1();
        m.sub();
        m.mult();
        m.mult1();
        m.show();
    }
    }
