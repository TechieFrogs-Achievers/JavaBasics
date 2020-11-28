//abstract class

abstract class Shape1
{
   //data members
   
    protected String color;
    protected boolean filled;

    public Shape1()     //default constructor
    {

    }

    public Shape1(String c,boolean f)       //two parameter constructor
    {
        color = c;
        filled = f;
    }

    String getColor()   //getter method for color
    {
        return color;
    }

    void setColor(String c)     //setter method for color
    {
        color = c;
    }

    Boolean getFilled()         //getter method for filled
    {
        return filled;
    }

    void setFilled(boolean f)       //setter method for filled
    {
        filled = f;
    }

    //abstract methods

    abstract double getArea();
    abstract double getPerimeter();
}

//subclass inherits the abstract class

class Circle2 extends Shape1
{
    protected double radius;    //defining variables

    public Circle2()            //default constructor
    {

    }

    public Circle2(double r,String c,boolean f)         //two parameter constructor
    {
       
        super(c,f);         //invokes super class constructor
        radius = r;
    }

    public double getRadius()       //getter method for radius
    {
        return radius;
    }

    public void setRadius(double r)     //setter method for radius
    {
        radius = r;
    }

    //implementation for abstract methods
  
    double getArea()        
    {
        double area = 3.14*radius*radius;

        return area;
    }

    double getPerimeter()
    {
        double perimeter = 2*3.14*radius;

        return perimeter;
    }
}

//subclass

class Rectangle3 extends Shape1
{
   //data members
   
    protected double width;
    protected double length;

    public Rectangle3()     //default constructor
    {
        
    }

    public Rectangle3(double w,double l,String c,boolean f)     //three parameter constructor
    {
        super(c,f);     //invokes parent class constructor
        width = w;
        length = l;
    }

    public void setWidth(double w)      //setter for width
    {
        width = w;

    }

    public void setLength(double l)         //setter for length
    {
        length = l;
    }

    public double getWidth()        //getter for width
    {
        return width;
    }

    public double getLength()       //getter for length
    {
        return length;
    }

   //implementation for abstract methods
   
    public double getArea()     
    {
        double area = width*length;
        return area;
    }

    public double getPerimeter()
    {
        double perimeter = 2*(length+width);

        return perimeter;
    }


}

//subclass for rectangle class

class Square3 extends Rectangle3
{
     double side;
   
    public Square3()        //default constructor
    {

    }

    public Square3(double s)        //single parameter constructor
    {
        side =s;
    }

    public Square3(double s,String c,boolean f)     //three parameter constructor
    {
        side = s;
        color = c;
        filled = f;

    }

    public double getSide()     //getter for side
    {
        return side;
    }

    public void setSide(double s)       //setter for side
    {
        side = s;
    }

    public void setWidth(double s)      //setter for width
    {
        this.side = s;
    }

    public void setLength(double s)     //setter for length
    {
        this.side = s;
    }

    //overriding the methods of rectangle class
    
    public double getArea()     
    {
       double area = side*side;

       return area;
    }

    public double getPerimeter()
    {
        double perimeter = 4*side;

        return perimeter;
    }

}
public class Abstract7
 {
    public static void main(String[] args)
     {
        Circle2 cc = new Circle2();     //creating object for circle class

            //methods calling with object

            cc.setColor("Blue");
            cc.setFilled(true);
            cc.setRadius(1.0);
            System.out.println(cc.getRadius());
            System.out.println(cc.getFilled());
            System.out.println(cc.getColor());
            System.out.println(cc.getArea());
            System.out.println(cc.getPerimeter());


        Rectangle3 rt = new Rectangle3();       //creating an object for rectangle class

           //methods calling with object
        
            rt.setColor("red");
            rt.setFilled(true);
            rt.setLength(4.5);
            rt.setWidth(6);
        System.out.println(rt.getColor());
        System.out.println(rt.getFilled());
        System.out.println(rt.getLength());
        System.out.println(rt.getWidth());
        System.out.println(rt.getArea());
        System.out.println(rt.getPerimeter());

        Square3 ss = new Square3();     //creating an object of square class

        
        //methods calling with object
        
        ss.setColor("white");
        ss.setFilled(true);
        ss.setSide(4);
        System.out.println(ss.getColor());
        System.out.println(ss.getFilled());
        System.out.println(ss.getSide());
        System.out.println(ss.getArea());
        System.out.println(ss.getPerimeter());


    }
}
