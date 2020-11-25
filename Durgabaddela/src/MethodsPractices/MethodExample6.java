package MethodsPractices;

// A as super class 

class A
{
    //static method for printing parent

    public static void display()
    {
        System.out.println("Parent");
    }
}

// B as sub class 

class B extends A
{
    //static method for printing child

    public static void display()
    {
        System.out.println("Child");
    }
}
public class MethodExample6 
{
    public static void main(String[] args) 
    {
        //object creation for parent class

        A a =  new A(); 

        //method calling by parent class object

        a.display(); 
        
         //object creation for child class

        B b = new B();

        //method calling by child class object

        b.display();

        A obj = new B();
        obj.display();

    }

}
