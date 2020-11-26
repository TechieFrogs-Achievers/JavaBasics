class Circle1
{
   private double radius;      //defining variables
    private String color;       

    public Circle1()
    {

    }
    
    public Circle1(double radius)       //single parameter constructor
    {
        this.radius = radius;
    }

    public Circle1(double radius,String color)      //two parameter constructor
    {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius()       //getter for radius
    {
        return radius;
    }

    public void setRadius(double a)     //setter for radius
    {
        radius = a;
    }

    public String getColor()        //getter for color
    {
        return color;
    }

    public void setColor(String b)      //setter for color
    {
        color = b;
    }

    public double getArea()         //getarea method to calculate area
    {
        double area = 3.14*radius*radius;
        return area;
    }
}

class Cylinder extends Circle1
{
  private double height;       //assigning data member
   
    public Cylinder()       //default constructor
    {

    }

    public Cylinder(double radius)      //single parameter constructor
    {
        super(radius);
    }
    
    public Cylinder(double radius,double height)        //two parameter constructor
    {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius,double height,String color)       //three parameter constructor
    {
        super(radius,color);        //invokes super class constructor
        this.height = height; 
    }

    public double getHeight()       //getter for height
    {
        return height;
    }

    public void setHeight(double h)     //setter for height
    {
        height = h;
    }
    
    public double getVolume()       //getvolume method to calculate volume
    {
       double volume = getArea()*height;
       return volume;
    }

    public double getArea()     //overridden method to calculate surface area
    {
        double area = (2*3.14*super.getRadius()*height+2*super.getArea()); 
        return area;
    }

}


public class InheritanceEx11 
{
 public static void main(String[] args)
  {
       Cylinder c = new Cylinder(); //object creation for subclass
       
    
       //initializing values by using getters and setters
       
       c.setRadius(1.0);
       c.setColor("red");       
       c.setHeight(1.0);
       
        //printing values of area and volume

       System.out.println(c.getArea());
       System.out.println(c.getVolume());
     
    }
}
