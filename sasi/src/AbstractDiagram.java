abstract class Shape5 // abstract class 
{
    protected String color; //data members protected
    protected boolean filled;
    public Shape5() //  default constractor 
    {

    }
    public Shape5(String c,boolean f) //two argument constructor
    {
        color=c;
        filled=f;
    }
    public String getcolor() //access method 
    {
        return color;
    }
    public void  setColor(String c) //mutator method
    {
       color=c;
    }
    public boolean isFilled( )
    {
        return filled;
    }
    public void setFilled(boolean f)
    {
        filled =f;
    }
     abstract double getArea(); //abstract method
    abstract double getPerimeter(); 
    public String toString() // string to string method 
    {
        return color+" "+filled;
    }
}
class Circle6 extends Shape5 //parent class inherits the abstract class 
{ 
    double radius;
    public Circle6()
    {

    }

    public Circle6(double r) // one argument constructor  for parent class 
    {
        radius=r;
    }
    public Circle6(double r,String c,boolean f) //two argumentconstructor
    {
        super(c,f);
        radius=r;
    }
    public double getRadius() //acess method
    {
        return radius;
    }
    public void setRadius(double r) //mutator methods
    {
        radius=r;
    }
   /* public void setColor(String s)
    {
        color=s;
    }*/
    public double getArea()
    {
        return 2*3.14*radius;
    }
    public double getPerimeter()
    {
        return 2*3.14*radius;
    }
    public String toString()
    {
        return color+" +filled+" +radius;
    }
}
class Rectangle3 extends Shape5 //child class inherits the abstract class 
{
    protected double width; // data members protected 
    protected double length;
    public Rectangle3() // default constructor for child class 
    {

    }
public Rectangle3(double w,double l) // two argument constructor 
{
    width=w;
    length=l;
}
public Rectangle3(double w,double l,String c,boolean f ) // three argument constrctor
{
    super(c, f);
    width=w;
    length=l;
}
public double getWidth() //acces method
{
    return width;
}
public void setWidth(double w) //mutator method 
{
     width=w;
}

public double getLength()
{
    return length;
}
public void setLength(double l)
{
    length=l;
}
public double getArea()
{
    return (length*width);
}
public  double getPerimeter()
{
    return 2*(length+width);
}
public String toString()
{
    return color+" "+filled+" "+width+" "+length;
}
}
class Square1 extends Rectangle3 //grand child inherites parent classs  
{
    protected double side;
    public Square1() //default constructor for grand child
    {

    }
    public Square1(double s,String c,boolean f)
    {
       // super(c,f);
        side=s;
    }
}
public class AbstractDiagram
 {
     public static void main(String[] args) 
     {
         System.out.println("....circle...");
         Circle6 c=new Circle6(); //object creation for child class 
         c.setColor("black"); //calling the method with object from child class 
         c.setFilled(true);
         c.setRadius(2.9);
         System.out.println(c.getcolor()); 
          System.out.println(c.isFilled());
         System.out.println(c.getRadius());
         System.out.println(c.getArea());
         System.out.println(c.getPerimeter());
         System.out.println(c.toString());
         System.out.println("\n");
         System.out.println("....rectangle....");
         Rectangle3 re=new Rectangle3(); // object created for parent class 
         re.setColor("white"); // calling the method with object from parent class 
         re.setFilled(true);
         re.setLength(20);
         re.setWidth(2);
         System.out.println(re.getcolor());
         System.out.println(re.getWidth());
         System.out.println(re.isFilled());
         System.out.println(re.getLength());
         System.out.println(re.getPerimeter());
         System.out.println(re.toString());
     }
    }