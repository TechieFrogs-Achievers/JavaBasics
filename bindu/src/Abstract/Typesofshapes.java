package Abstract;

abstract class Typesofshapes 
{
  protected String color;  //protected data member
  protected boolean filled;  
 Typesofshapes()  //default method
{

}
 Typesofshapes(String c,boolean f)   //constructor using the parameters
{
    color = c;
    filled =f;
}
String getColor()   
{
    return color; //returns the color of shapes
}
void setColor(String c)
{
    color =c;
}
void setFilled(boolean f)  //mutator method
{
    filled = f;
}
boolean isFilled()
{
    return filled;
}
//void setFilled(boolean f)
//{
    //filled =f;
//}
 abstract double getArea();
 abstract double getPerimeter();
 public String tostring()
 {
     return color+" "+filled;
 }
}
class Circle extends Typesofshapes   //subclass inherits the parentclass
{
    protected double radius;
     public Circle()
    {

    }
    public Circle(double r)
    {
        radius =r;    //assigns parameter to variable
    }
    public Circle(double r,String c,boolean f)
    {
        super(c,f);
        radius = r;
         //color = c;
      // filled = f;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double r)
    {
        radius =r;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;    //area of circle
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    public String toString()
    {
        return color+" "+filled+" "+radius;    //returns the values of circle
    }
}
class Rectangle extends Typesofshapes
{
    protected double width;   //protected data members
    protected double length;
    Rectangle(String c, boolean f)
    {

    }
    public Rectangle(double w,double l)
    {
        width = w;
        length = l;
    }
    public Rectangle(double w,double l,String c,boolean f)   //mutator method
    {
        super(c,f);
        width =w;
        length = l;    //assigns the value to the variable
    }
    
    public Rectangle() {
    }

    public double getWidth()
    {
        return width;
    }
    public void setWidth(double w)
    {
        width = w;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double l)
    {
        length = l;

    }
    public double getArea()
    {
        return (length*width);   //area of the rectangle
    }
    public double getPerimeter()
    {
        return 2*(length+width);   //perimeter of rectangle
    }
    public String toString()
    {
        return color+" "+filled+" "+length+" "+width;
    }
}
class Square extends Rectangle   //subclass inherits the rectangle 
{
    protected double side;
    Square()
    {

    }
    public Square(double s)
    {
        super();
        side=s;
    }
    public Square(double s,String c,boolean f)
    {
        super(c,f);   //inherits from the rectangle class
        side =s;
    }
    public double getSide()
    {
        return side; 
    }
    public void setSide(double s)
    {
        side=s;
    }
    public void setWidth(double w)   //mutator method
    {
        width =w;
    }
    public void setLength(double l)
    {
        length =l;
    }
    public String toString()
    {
        return color+" "+filled+" "+length;
    }
    public static void main(String[] args) 
    {
        System.out.println("--------Circle--------");
        Circle c = new Circle();    //creating object for the subclass
        c.setColor("black");
        c.setFilled(true);  //calling the methods 
        c.setRadius(1.0);
        System.out.println("the circle color:"+c.getColor());
        System.out.println("the circle filled:"+c.isFilled());
        System.out.println( "the circle radius:"+c.getRadius());
        System.out.println("the circle area:"+c.getArea());
        System.out.println("the circle perimeter:"+c.getPerimeter());
        System.out.println("the objects of circle :"+c.toString());
        System.out.println("/n");

        System.out.println("-------Rectangle----------");
        Rectangle r = new Rectangle();    //creating method for the subclass
        r.setColor("Blue");
        r.setFilled(true);
        r.setWidth(1.0);
        r.setLength(1.0);
        System.out.println("the rectangle color:"+r.getColor());   //prints the values
        System.out.println("the rectangle filled:"+r.isFilled());
        System.out.println("the rectangle width:"+r.getWidth());
        System.out.println("the rectangle length:"+r.getLength());
        System.out.println("the rectangle Area:"+r.getArea());
        System.out.println("the rectangle perimeter:"+r.getPerimeter());
        System.out.println("the objects of rectangle:"+c.toString());
        System.out.println("/n");

        System.out.println("--------Square---------");
        Square s = new Square();
        s.setColor("white");
        s.setFilled(true);
        s.setSide(5);
        s.setWidth(7);
        s.setLength(9);
        System.out.println("the square color:"+s.getColor());
        System.out.println("the square filled:"+s.isFilled());
        System.out.println("the square side:"+s.getSide());
        System.out.println("the square width:"+s.getWidth());
        System.out.println("the square length:"+s.getLength());
        System.out.println("the  objects of Square:"+s.toString());
    }


}









    

