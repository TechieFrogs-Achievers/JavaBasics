class A {
    int i,j;
    A()         //constructor of a class

    {

    }
    public void show()
    {
        //int i=2;
        //int j=3;
        System.out.println("i and j value is:"+ i+j);
    }
}
class B extends  A
{
int k;
B()         //constructor of a class
{
    System.out.println("constructor of class b");
}
public void show()  //
{
    System.out.println("The value of k is:"+k);

}
}
public class A1

{
    public static void main(String args[])
    {
        A1 a =new A1();
        B b = new B();
        b.show();
        A a1=new A();
        a1.show();
    }

}
