package InheritenceExcercises;

//parent class A

class A
{
    int i, j;
    public A(int i, int j)
    {
       this.i= i;
       this.j= j;
    }
    void show()
    {
        //System.out.println("display:" + i+" " +j);
    }
}
class B extends A
{
    int k;
    public B(int k)
    {
        super(6,8);
        this.k = k;
    }
    void show()
    {
       System.out.println(super.i);
       System.out.println(super.j);
       System.out.println(this.k);
    }
}
public class Inheritence7 
{
    public static void main(String[] args)
    {
        
        B object = new B(7);
        object.show();
        
    }
}
