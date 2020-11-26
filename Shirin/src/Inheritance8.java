class A 
{
    int i;
    int j;
    // constructor 
    A( int v1,int v2)
    {
        i = v1;
        j = v2;

    }
    // method for super class
    void Show()
    {   
        // print i,j values
        System.out.println("i value is :" +i);
        System.out.println("j value is :" +j);
    }   
}
// sub class
class B extends A
{
    int k ;
    B(int v3)
    {
        super(v3 ,v3);
        k = v3;
    }
    // creating method for sub class
    void Show()
    {
        System.out.println(" k value is:" +k);
    }

}
public class Inheritance8
{
    public static void main(String[] args) 
    {
        A Ab = new A(6 , 7);// object for class A
        Ab.Show();
        B bclassobjct = new B(5);// object for class b
        bclassobjct.Show();


        
    }
}
