package Assignment4;

class Parent1{
    //making parent class method as private
    private void show() {
        System.out.println("This is Parent class");
    }
}
// child class extends parent class
class Child1 extends Parent1 {
    void display() {
        System.out.println("This is Child class");
    }
}
public class Inheritence2 {
    public static void main(String[] args) {
        // creating objects for both classes
        Parent1 p = new Parent1();
        Child1 c = new Child1();
        // calling the methods by its objects
        c.display();
        //p.show(); //we cant call private method from another class
        
    }
}
