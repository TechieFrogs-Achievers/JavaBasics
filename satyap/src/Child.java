// Using Inheritance Program
class Parent 
{
    void display() // Method for parent method
    {
        System.out.println("Parent Method");

    }
}
class Child extends Parent{ // child class
    void show()
    {
        System.out.println("Child Method"); // Method for child method

    }

    public static void main(String args[])
    {
        Child c=new Child(); // obj for child class
        c.show();            // method call for child class
        c.display();         // object calling child obj with parent class 
        Parent p=new Parent();  // obj for parent class
        p.display();         // object calling parent class with parent obj

}

    
}
