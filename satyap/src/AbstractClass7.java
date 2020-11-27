abstract class Shape3 //Abstract class
{
    protected String color; // protected datamembers
    protected boolean filled;
    abstract double getArea(); // abstract methods
    abstract double getPerimeter();
    public void setColor(String c) // accessor and mutators
    {
        color=c;
        System.out.println("Color:"+color);
    }
    public String getColor()
    {
        return color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean fill)
    {
        filled=fill;
        System.out.println("Filled:"+filled);
    }
} 
class Circle2 extends Shape3 // Subclass1
{
    Circle2() // Constructors
    {

    }
    Circle2(double r)
    {
        radius=r;
    }
    Circle2(double r,String c,boolean fill)
    {
        radius=r;
        color=c;
        filled=fill;
    }
    double getArea() // Abstract methods
    {
       return radius*radius*3.14; 
    }
    double getPerimeter()
    {
        return 2*3.14*radius;
    }
    public double getRadius()// Accessors and mutators
    {
        return radius;
    }
    double radius;
    public void setRadius(double radius)
    {
        this.radius=radius;
        //System.out.println("Radius:"+radius);
    }
    public String toString()
    {
        return color+" "+filled+" "+radius;
    }
}
class Rectangle2 extends Shape3 // Subclass2
{
    double width=1.0; // datamembers
    double length=1.0;
    Rectangle2() // constructors
    {

    }
    Rectangle2(double w,double l)
    {
       width=w;
       length=l;
    }
    Rectangle2(double w,double l,String c,boolean fill)
    {
        width=w;
        length=l;
        color=c;
        filled=fill;
    }
    public double getWidth() // Accessors and mutators
    {
        return width;
    }
    public void setWidth(double w)
    {
        width=w;
        //System.out.println("Width:"+getWidth(width));
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double l)
    {
       length=l;
       
    }
    double getArea() // Extending Abstract methods
    {
        return length*width;
    }
    double getPerimeter()
    {
        return ((length+width)*2.0);
    }
    public String toString() // overriding toString() form parentclass
    {
        return color+" "+filled+" "+length+" "+width;
    }
}
class Square2 extends Rectangle2 // Subclass3
{
    double side; // datamembers
    Square2() // constructors
    {

    }
    Square2(double side)
    {
      this.side=side;
    }
    Square2(double side,String color,boolean filled)
    {
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide() // Accessor and mutators
    {
        return side;
    }
    public void setSide(double s)
    {
        side=s;
       // System.out.println("Side:"+getSide());
    }
    public void setLength(double l)
    {
        length=l;
       // System.out.println("Length:"+getLength(length));
    }
    public void setWidth(double w)
    {
        width=w;
       // System.out.println("Width:"+getWidth(width));
    }
}
public class AbstractClass7 // Driver class
{
    public static void main(String[] args) {
        Circle2 s3=new Circle2(); // Obj creation for Child1
        Rectangle2 s4=new Rectangle2(); // obj creation for Child2
        Square2 s5=new Square2();// Obj creation for Child3
        s3.setColor("Blue"); 
        s3.getColor();
        s3.setFilled(true);
        s3.isFilled();
        s3.setRadius(2.0d);
        System.out.println("Radius:"+s3.getRadius());
        System.out.println("Perimeter of Circle:"+s3.getPerimeter());
        System.out.println("Perimeter of Rectangle:"+s4.getPerimeter());
        s4.setLength(3.0d);
        System.out.println("Length:"+s4.getLength());
        s4.setWidth(4.0d);
        System.out.println("Width:"+s4.getWidth());
        System.out.println("Area of circle:"+(s3.getArea()));
        System.out.println("Area of rectangle:"+s4.getArea());
        s4.setColor("pink");
        s4.getColor();
        s4.setFilled(false);
        s4.isFilled();
        s5.setSide(5.0d);
        System.out.println("Side:"+s5.getSide());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        
        
       // System.out.println("Radius:"+s3.getRadius());
    }
}
