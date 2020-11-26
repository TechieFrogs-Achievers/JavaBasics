//package Inheritance;

//shape class
class Shape
{
    //method for shape class
    public void shape()
    {
        System.out.println("This is shape");
    }
}
//subclass
class Rectangle1 extends Shape
{
    //method for printing recctangle shape in console
    public void rectangleShape()
    {
        System.out.println("This is rectangle shape");
    }
}

//another subclass for shape parent class
class Circle extends Shape
{
    //method for circle subclass
    public void circleShape()
    {
        System.out.println("This is circle shape");
    }
}

//sub class for rectangle class
class Square1 extends Rectangle1
{
    public void squareShape()
    {
        System.out.println("Square is a rectangle");
    }
}
public class InheritanceExampleForMultilevelExample 
{
    public static void main(String[] args) {
        Square1 squareObj = new Square1();          //creating object for square class
        squareObj.shape();                          //calling shape class's method
        squareObj.rectangleShape();                 //calling rectangle class's method
    }
    
}
