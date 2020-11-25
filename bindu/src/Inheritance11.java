class Circle2 //super class
    {
    private Double radius; 
    private String color;
    Circle2() //default constructor
    {

    }
    Circle2(Double r) //parameterised constructor
    {
        radius =r;
    }
    Circle2(String c,Double r) 
    {
        radius =r;
        color = c;  //assigning parameter to variable
    }
    public Double getradius()  //get value from the set method
    {
        return radius;    
    }
    public void setradius(double value)   //setting value for private variable
    {
        radius = value;    //returns radius
    }
    public String getColor()
    {
        return color;
    }
    public void setcolor(String val)
    {
        color = val;
    }
    public double getArea()
    {
        return radius*radius*3.14;  //area of circle pi*r*r*h
    }
}

class Cylinder extends Circle2   //sub class inherits superclass
{
    private double height;
    Cylinder()  //default constructor 
    {

    }
    Cylinder(double r)
    {
        super(r);   //calling parent class constructor
    }
    Cylinder(double r,double h)  //parameterized constructor
    {
        super(r);
        height = h;
    }
    Cylinder(double r, double h, String c)
    {
        super(c,r);
        height = h;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double h)
    {
        height = h;
    }
    public double getArea()   //method overriding 
    {
        double surfaceArea =((2*3.14*getradius()*height)+(2*3.14*getradius()));
        return surfaceArea;   //returns surfaceArea
    }
    public double getVolume()
    {
        return getArea()*height;  
    }
}
public class Inheritance11
{
    public static void main(String[] args) 
    {
        Circle2 c = new Circle2();        //creating objects with super class
        //calling all the methods with object
        System.out.println("......Circle value.....");
        c.setradius(3.0);      
        System.out.println("Radius:"+c.getradius());
        c.setcolor("Red");  //assigning color 
        System.out.println("color:"+c.getColor());
        System.out.println("Area:"+c.getArea());
        System.out.println();

        Cylinder c1 = new Cylinder();       //creating object to child class
        System.out.println(".....Cylinder values.....");
        c1.setHeight(1.0);
        c1.setcolor("Blue");
        System.out.println("Height:"+c1.getHeight());
        c1.setradius(4.0);
        System.out.println("radius:"+c1.getradius());
        System.out.println("color:"+c1.getColor());
        System.out.println("surfaceArea:"+c1.getArea());   //calling the surfacearea of cylinder
        System.out.println("Volume:"+c1.getVolume());

    }
}




    

