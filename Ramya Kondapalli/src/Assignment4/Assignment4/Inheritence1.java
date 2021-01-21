package Assignment4;
//parent class
class Parent{
    static void show() {
        System.out.println("This is Parent class");
    }
}

// child class extends parent class
class Child extends Parent {
    static void display() {
        System.out.println("This is Child class");
    }
}

public class Inheritence1 {
    public static void main(String[] args) {
        // creating objects for both classes
        Parent p = new Parent();
        Child c = new Child();
        // calling the methods by its objects
        Parent.show();
        Child.display();
        Parent.show();

        
    }
}

