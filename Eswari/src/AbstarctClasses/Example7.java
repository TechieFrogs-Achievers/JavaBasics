package AbstarctClasses;

// import jdk.jfr.SettingControl;

//abstract class
abstract class Shape1
{
    protected String color;
    protected boolean filled;
    abstract double getArea();
    abstract double getPerimeter();
    Shape1()
    {

    }
    //parametarized constructor
    Shape1(String color, boolean filled)
    {
        //assigning local variables
        this.color = color;
        this.filled = filled;
    }
    //accessor method for color
    String getColor()
    {
        return color;
    }
    //setter method for color
    void setColor(String color)
    {
        this.color = color;
    }
    //getter method for filled
    boolean isFilled()
    {
        return filled;
    }
    //setter method for filled
    void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public String toString()
    {
        return color +" " +filled;
    }
}

//child class
class Circle extends Shape1
{
    protected double radius;
    //default constructor
    Circle()
    {

    }
    //parametarized constructor
    Circle(double radius)
    {
        this.radius = radius;
    }
    //parametarized constructor
    Circle(double radius, String color, boolean filled)
    {
        super(color,filled);
        this.radius = radius;
    }
    //getter method for radius
    double getRadius()
    {
        return radius;
    }
    //setter method for radius
    void setRadius(double radius)
    {
        this.radius = radius;
    }
    //abstract method implementation
    double getArea()
    {

        return Math.PI *radius *radius;
    }
    //abstract perimeter method implementation
    double getPerimeter()
    {
        return 2 * Math.PI *radius;
    } 
    //tostring method
    public String toString()
    {
        return color +" " +filled +" " +radius;
    }

}
//second child class
class Rectangle extends Shape1
{
    //variables
    protected double length;
    protected double width;
    //default constructor
    Rectangle()
    {

    }
    //parametarized constructor
    Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    //parametarized constructor
    Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
        
    }
    //getter method for width
    double getWidth()
    {
        return width;
    }
    //setter method for width
    void setWidth(double width)
    {
        this.width = width;
    }
    //getter method for length
    double getLength()
    {
        return length;
    }
    //setter method for length
    void setLength(double length)
    {
        this.length = length;
    }
    //abstract Rectangle method implementation
    double getArea()
    {
        return length * width;
    }
    //abstract perimeter method implementation
    double getPerimeter()
    {
        return (2 *(length + width));
    }
    //tostring method
    public String toString()
    {
        return color +" " +filled +" " +length +" " +width;
    }

} 
//child class for rectangle class
class Square extends Rectangle
{
    double side;
    //default constructor
    Square()
    {

    }
    //Parametarized constructor
    Square(double side)
    {
        this.side = side;
    }
    //parametarized constructor
    Square(double side, String color, boolean filled)
    {
        
        super.color=color;
        super.filled=filled;
        this.side = side;

    }
    //getter method for side
    double getSide()
    {
        return side;
    }
    //setter method for side
    void setSide(double side)
    {
        this.side = side;
    }
    //setter method for length
    void setLength(double length)
    {
        this.length = length;
    }
    //setter method for width
    void setWidth(double width)
    {
        this.width = width;
    }
    //tostring method
    public String toString()
    {
        return color +" " +filled +" " +length +" " +width;
    }
    

} 


public class Example7 
{
    public static void main(String[] args) {
        System.out.println("------Circle details---------");
        Circle c= new Circle();                                     //circle class object creation
        c.setRadius(4.2);                                           //methods caling
        System.out.println("The radius is " +c.getRadius());
        c.setColor("Blue");
        System.out.println("Color is " +c.getColor());
        c.setFilled(false);
        System.out.println("Is filled or not " +c.isFilled());
        System.out.println("The area of circle is " +c.getArea());
        System.out.println("The perimeter of circle is " +c.getPerimeter());
        System.out.println("ToString" +c.toString());

        System.out.println("---------Rectangle Details----------");
        Rectangle r = new Rectangle();                                  //rectangle class object creation
        r.setLength(4.5);                                               //methods calling
        System.out.println("The length is " +r.getLength());
        r.setWidth(5.2);
        System.out.println("the width is " +r.getWidth());
        r.setColor("red");
        System.out.println("the color is " +r.getColor());
        r.setFilled(true);
        System.out.println("The value for boolean is " +r.isFilled());
        System.out.println("The area for rectangle is " +r.getArea());
        System.out.println("The perimeter for rectangle is " +r.getPerimeter());
        System.out.println("Tostring " +r.toString());

        System.out.println("------Square details---------");
        Square s = new Square();                            //square class object creation
        s.setSide(5);                                       //method calling
        System.out.println("Side is " +s.getSide());
        s.setColor("Green");
        System.out.println("The color is " +s.getColor());
        s.setFilled(true);
        System.out.println("Filled or not " +s.isFilled());
        s.setLength(5);
        s.setWidth(6);
        System.out.println("Length is " +s.getLength());
        System.out.println("Width is " +s.getWidth());
        System.out.println("Tostring " +s.toString());
    }
    
}

