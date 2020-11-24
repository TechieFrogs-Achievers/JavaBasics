class Counter //Parent class
{
    int i; // datamember
    void increment(int i) // method for parent class
    {
        System.out.println("i value:"+i);
    }

    
}
class Child3 extends Counter //child class 
{
    void display() // method for child class
    {
    System.out.println("Child Method");
    }
    
}
class Inheritance7 // main class
{
    public static void main(String[] args) 
    {
    Child3 c=new Child3(); // obj creation for child class
    c.increment(3); // method calling for increment method 
    c.display(); // method calling for display method
    }

}

