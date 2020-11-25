class Addition  // class Addition of Method Overloading 
{
    public void add() //method for default constructor
    {
        System.out.println("Defualt constructor");
    }
    public void add(int a,int b) // same method but diff paremeters of add method
    {
        System.out.println("Addition of two number"+" "+(a+b));
    } 
    public void add(float a,int b,float c) // same method but diffe parameter of add methods
    {
        System.out.println("Addition of three numbers"+" "+(a+b+c));
    }
}
public class MethodOverloading //main class
{
    public static void main(String[] args) {
        Addition a=new Addition(); // obj for addition class
        a.add(); // method call for add method for default method
        a.add(10,20); // method call for add method of (int,int)
        a.add(45.2f,23,56.8f); // method call for add method of(float,int,float)
    }
}
