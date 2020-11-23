public class ConstructorChaining3 
{
    //static block
    static
    {
        int x=10;
        System.out.println(x);
    }

    //constructor
    ConstructorChaining3()
    {
        System.out.println(" inside constructor");
    }

    //init block
    {
     System.out.println("init ");
    }

    //static method
    static void substraction()
    {
        System.out.println("inside static method");
    }

    //instance method
    private void add()
    {
       System.out.println("inside instance method");
    }
 
    public static void main(String[] tg)
    {
        ConstructorChaining3.substraction();
        //object to initialize instance of class ConstructorChaining3
        ConstructorChaining3 construct2=new ConstructorChaining3();
        construct2.add();
        
    }
    
}
