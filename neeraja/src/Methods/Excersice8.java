package Methods;

class A{
    //defining the method with static
    static void print(){
        System.out.println("Parent");
    }
}
//inherting the properties of parent class
class B extends A{
    //defining the overridingmethod with static
    static void print(){
        System.out.println("child");
        
    }
}
public class Excersice8 {
    public static void main(String[] args) {
        A a= new A();
        B b= new B();
        A aa = new B(); //creating object to parent class
        aa.print();//calling the method by the object of parent class
        a.print();//calling the method by the object of calss
        b.print();//calling the method by the object of calss



    }
}
