abstract class Shape1 // abstract class Shape
{
    abstract void rectangleArea(int length,int breadth); // abstract method1 for Area of rectangle
    abstract void squareArea(int side); // abstract method2 for Area of square
    abstract void circleArea(double radius); // abstract method3 for Area of Circle
}
class Area1 extends Shape1 // Subclass
{
    void rectangleArea(int length,int breadth) // Extending abstract method1
    {
        int area=length*breadth;
        System.out.println("Area of rectangle:"+area);
    }
    void squareArea(int side) // Extending abstract method2
    {
        int area1=side*side;
        System.out.println("Area of Square:"+area1);
    }
    void circleArea(double radius) // Extending abstract method3
    {
        double area2=3.14*radius*radius;
        System.out.println("Area of Circle:"+area2);
    }
}
public class AbstractClass6 // Driver class
{
    public static void main(String[] args)
    {
        Shape1 s=new Area1(); // upcasting 
        s.rectangleArea(10,20); //method call for rectangleArea()
        s.squareArea(5); // method call for squareArea()
        s.circleArea(6); // method call for circleArea()
    }
}


