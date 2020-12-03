package Interface;
interface MyInterface{
    public void demo();
    public static void display() {
       System.out.println("This is a static method");
    }
}
 
 public class Rough implements MyInterface {
     
    public void demo() {
       System.out.println("This is the implementation of the demo method");
    }
    public static void main(String args[]) {
       Rough obj = new Rough();
       obj.demo();
       MyInterface.display();
    }
 }