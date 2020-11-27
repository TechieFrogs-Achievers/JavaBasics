package AbstractClasses;
//abstract class
abstract class Shape{
    //abstract methods 
    abstract void ReactangleArea(int l,int b);
    abstract void SquareArea(int s);
    abstract void CircleArea(int r);
}
//sub class
//methods for calculating areaa of reactangle ,square and circle
class Area extends Shape{
    void ReactangleArea(int l,int b){
        System.out.println("Area of Reactangle : " + (l*b));
    }
    void SquareArea(int s) {
       System.out.println("Area of Square : " + (4*s));
    }
    void CircleArea(int r) {
        float pi = 3.14f;
        System.out.println("Area of Circle : " + (2 * pi * r));
    }
}
//main class
public class AbstractExcercise6 {
    public static void main(String[] args) {
      Area a =new Area();  //object creation
      //calling methods through object of subclass to calculate area
      a.ReactangleArea(4, 8);
      a.SquareArea(4);
      a.CircleArea(6); 
    }
}
