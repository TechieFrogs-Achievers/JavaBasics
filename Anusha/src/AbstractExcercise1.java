public class AbstractExcercise1
{
    public static void main(String[] args) 
    {
       SubClass1 s1=new SubClass1();//object create for subclass1
       s1.message();//calling method
       SubClass2 s2=new SubClass2();//object create for subclass1
       s2.message(); //calling method
       ParentA p1=new SubClass1();
       p1.message();//calling method
       ParentA p2=new SubClass2();
       p2.message();//calling method

    }
}
//abstract class
abstract class ParentA
{
    abstract void message();
}
//extends the abstract class to subclass1
class SubClass1 extends ParentA
{
    void message()
    {
        System.out.println("This is first subclass");
    }
}
//extends the abstract class to subclass2
class SubClass2 extends ParentA
{
    void message()
    {
        System.out.println("This is Second subclass");
    }
}
