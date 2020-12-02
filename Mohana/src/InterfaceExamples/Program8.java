package InterfaceExamples;

interface A //interface 
{
    void method(); //method 

    class B //inner class 
    {
        void innerMethod() //inner method
        {
            System.out.println("iam an inner class of interface");
        }
    }
}

public class Program8  implements A
{ 
    public void  method() //inteface method implementation
       {
          System.out.println("interface method");
           
       }
    public static void main(String[] args) 
    {
       
     //inner class obj creation
      B b = new B();
       b.innerMethod(); 

       //class obj to call implemented  method

       Program8 p = new Program8();
       p.method();
      
        
    }
    
}
