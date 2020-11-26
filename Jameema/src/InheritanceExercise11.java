class Circle1
{
    private double radius;
    private String color;
    Circle1() //default constructor

    {

    }
    Circle1(double r) //parameterised constructor
    {
        radius=r;
    }
    Circle1(double r , String c)
    {
        radius=r;
        color=c; //assign parameter to variable
    }
    public double getRadius() //getting value from set method
    {
        return radius; //returns the radius
    }
    public void setRadius(double r) //set value for private variable
    {
        radius=r;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String c)
    {
        color=c;
    }
    public double getArea()
    {
          return Math.PI*radius*radius;
    }
}
class Cylinder extends Circle1 //inherit the parent class details
{
    private double height;
    Cylinder()  //default constructor
    {

    }
    Cylinder(double r)
    {
        super(r); //calling parent class constructor
    }
    Cylinder(double r , double h) //parameterised constructor
    {
        super(r);
        height=h;
    }
    Cylinder(double r, double h,String c)
    {
        super(r,c);
        height=h;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double h)
    {
        height=h;
    }
    public double getArea() //method overriding
    {
        double SurfaceArea=(2*3.14*getRadius()*height)+(2*3.14*getRadius()* getRadius());
        return SurfaceArea; //returns surface area
    }
    public double getVolume()
    {
        return getArea()*height;
    }
}
public class InheritanceExercise11
 {
     public static void main(String[] args) 
     {
         System.out.println("circle details");
         Circle1 circleobj = new Circle1(); //creating object to parentclass
         circleobj.setRadius(1.0); //calling method by using object
         System.out.println("Radius :" +circleobj.getRadius());
         circleobj.setColor("Red");
         System.out.println("color :" +circleobj.getColor());
         System.out.println("Area of circle :" +circleobj.getArea());
         System.out.println();
         System.out.println("cylinder details");
         Cylinder cylinderobj = new Cylinder(); //creating object to child class
         cylinderobj.setRadius(8.0); // calling method by using object
         cylinderobj.setColor("green");
         cylinderobj.setHeight(1.0);
         System.out.println("Radius :" +cylinderobj.getRadius());
         System.out.println("color :" +cylinderobj.getColor());
         System.out.println("Height :" +cylinderobj.getHeight());
         System.out.println("volume of cylinder :"+cylinderobj.getVolume()); //printing volume of cylinder
         System.out.println("Surface area :" +cylinderobj.getArea()); //printing surface area
     }
    
}
