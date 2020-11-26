package inheritence;

class A
{
    int i,j;

    //parent class constructor
    public A(int x, int y)
    {
        i=x;
        j=y;
    }
    //over riden method
    void show()
    {
        //System.out.println("i="+i+"  "+"j="+j);
    }
}

class B extends A
{
    int k;
    //child class constuctor
    public B(int z)
    {
      super(5,6);
      k=z;
    }
    //overriding method
    void show()
    {
        System.out.println("i="+super.i);
        System.out.println("i="+super.j);
        System.out.println("k="+k);
    }
}
public class Program8
{
    public static void main(String[] a)
    {
        
       //for child class
       B b=new B(8);
       b.show();// method call

    }
    
}
