package AbstractClasses;
//abstract class
abstract class Animals{
    //abstract methods
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals{
    //abstract method implementation
    void cats(){
        System.out.println("Cat Meow");
    }
    void dogs() {
          
    }
}
class Dogs extends Animals{
    //abstract method implementation
    void dogs(){
        System.out.println("Dog bark");
    }
    void cats() {
       
    }
    void show(){
        System.out.println("hello");
    }
}
//main class
public class AbstractExcercise5 {
    public static void main(String[] args) {
    //creating objects to the child class
    Cats c = new Cats();
    Dogs d = new Dogs();
    //calling methods through objects of each class
    c.cats();
    d.dogs();
    }
    
}
