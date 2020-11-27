package AbstarctClasses;

//abstract class
abstract class Shape
{
    //abstract methods declaration
    abstract void RectangleArea(int length, int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(double radius);

}
//normal class
class Area
{
    //abstract method implementation for rectangle area
    void RectangleArea(int length, int breadth)
    {
        int area = length * breadth;
        System.out.println("The area of rectangle is " +area);
    }
    //abstract method for square area
    void SquareArea(int side)
    {
        int area = side * side;
        System.out.println("Area of square is " +area);
    }
    //abstract method for circle area
    void CircleArea(double  radius)
    {
        double area = Math.PI *radius *radius;
        System.out.println("Circle area is " +area);
    }

}
public class Example6 
{
    public static void main(String[] args) {
        Area a = new Area();                    //child class object creation
        a.RectangleArea(5, 4);                  //recrangle area method calling
        a.SquareArea(5);                        //square area method calling
        a.CircleArea(5.2);                      //circle area method calling 
    }
    
}
