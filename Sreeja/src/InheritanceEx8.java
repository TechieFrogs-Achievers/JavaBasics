class A
{
    int i = 3;      //initializing variables
    int j = 5;      

   public A()       //default constructor
    {

    }
    void show()         //method to print values
    {
        System.out.println(i+" "+j);
    }
}
class B extends A
{
    int k = 7;          //assigning variable

    void show()         // method to print k value
    {
        System.out.println(k);
    }

    public B()      //default constructor
    {

    }

}

public class InheritanceEx8
 {
     public static void main(String[] args)
      {
        B b = new B();      //creating object
        b.show();       //method calling
    }
}
