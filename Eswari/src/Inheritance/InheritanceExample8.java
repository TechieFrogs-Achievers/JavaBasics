//package Inheritance;

//class A
class A
{
    int i,j;
    A(int a, int b)
    {
        i = a;
        j = b;
    }
    public void show()
    {
        System.out.println("i value :" +i);
        System.out.println("j value :" +j);
    }

}

//class B
class B extends A
{
    int k;
    B(int c)
    {
        
        super(c,c);
        k = c;
        // super();
    }
    public void show()
    {
        System.out.println("k value :" +k);
    }

}
public class InheritanceExample8 
{
    public static void main(String[] args) {
        B bObject = new B(3);
        bObject.show();
        // A aObject = new A(4,5);
        // aObject.show();
    }
    
}
