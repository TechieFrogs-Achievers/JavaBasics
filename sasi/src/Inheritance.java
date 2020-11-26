class Circle1 //parent  class
{
    private double radius;  //data members 
    private String color;
    Circle1() // default constructor
    {

    }
    Circle1(double r) // parameter constructor
    {
        radius =r;
    }
    Circle1(double r,String c)
{
    radius=r;
    color=c;
}    
    public double getRadius()  // acess and mutors
    {
        return radius;
    }
    public void setRadius(double value)
    {
        radius=value;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String val)
    {
        color=val;
    }
    public double getArea()
    {
        return radius*radius*3.14;
    }
}
class Cylinder extends Circle1 //child class getting properties from parent
{
    private double height;  //data member
    Cylinder() // default constructor for child class 
    {

    }
    Cylinder(double r,double h)
    {
        super(r);
        height=h;
    }
    Cylinder(double r,double h,String c)
    {
        super(r,c);
        height=h;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double value)
    {
        height=value;
    }
    public double getVolume()
    {
        return getArea()*height;
    }
}
public class Inheritance
{
    public static void main(String[] args)
     {
         Circle1 c=new Circle1();  // object creation for parent class
         System.out.println(".....circle values...");
         c.setRadius(2.0); //calling the method with object from parent class
         System.out.println("radius:"+c.getRadius());
         c.setColor("red");
         System.out.println("color:"+c.getColor());
         System.out.println("Area:"+c.getArea());
         System.out.println();
         Cylinder c1=new Cylinder(); //object creation for child class
         System.out.println("....cylinder values...");
         c1.setHeight(5.0); //calling the method with object from child class
         c1.setColor("black");
         System.out.println("height:"+c1.getHeight());
         c1.setRadius(2.0);
         System.out.println("radius:"+c1.getRadius());
         System.out.println("color:"+c1.getColor());
         System.out.println("Area:"+c1.getArea());
         System.out.println("volume"+c1.getVolume());
     }
        
    }
