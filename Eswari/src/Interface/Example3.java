package Interface;

//interface creation
interface InterfaceExample
{
    //abstract methods
    public void add(int a, int b);
    public void sub(int a,int b);
    public void mul(int a,int b);

}

//main class
public class Example3 implements InterfaceExample
{ 
    //abstract method1 implementation
    public void add(int a, int b)
    {
        int c = a + b;
        System.out.println(c);
    }
    //abstract method2 implementation
    public void sub(int a, int b)
    {
        int c= a - b;
        System.out.println(c);
    }
    //abstract method3 implementation
    public void mul(int a , int b)
    {
        int c = a * b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Example3 e = new Example3();            //object creation
        e.add(5, 4);                            //methods calling
        e.sub(9, 4);
        e.mul(2, 5);
    
        
    }
    
    
}