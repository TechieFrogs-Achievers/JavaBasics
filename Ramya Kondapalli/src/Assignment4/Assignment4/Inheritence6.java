package Assignment4;
class Shape{
    //parent class
    void shapedispaly(){
        System.out.println("This is shape");
    }
}
class Reactangle1 extends Shape{
    //child class extending the parent class
    void reactangleDisplay(){
        System.out.println("This is Reactangle shape");
    }
}
class circle extends Shape{
    //child class extending the parent class
    void squareDisplay(){
        System.out.println("This is circular shape");
    }
}
//it is inheriting reactangle class
class Square1 extends Reactangle1{
    void dispaly(){
        System.out.println("Square is a Reactangle");
    }
}
public class Inheritence6 {
    public static void main(String[] args) {
        Square1 s = new Square1();
        //calling methods by the objects of subclass
        s.shapedispaly();
        s.reactangleDisplay();

    }
}
