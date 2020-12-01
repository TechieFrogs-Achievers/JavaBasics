package InheritenceExcercises;
// circle as a super class
 
class Circlee
{
    double radius;
    String color;

    //default constructor

    Circlee() 
    {

    }

    // constructor has radius parameter

    Circlee(double r) 
    {
        radius = r;
    }

    //constructor have radius and color parameters

    Circlee(double r, String c) {
        radius = r;
        color = c;
    }

    //getter to retrive the radius value

    public double getRadius()
    {
        return radius;
    }
    //setter to set the  radius value

    public void setRadius(double value)
    {
        radius = value;
    }
    //getter to retrive the colour value 

    public String getColor() {
        return color;
    }

    //setter to set the colour  value

    public void setColor(String val) 
    {
        color = val;
    }

    // method to caluculate area for circle

    public double getArea()
    {
        return 3.14 * radius * radius;
    }

}

// sub class
class Cylinder extends Circlee 
{
    private double height;

    //default constructor
    Cylinder() {

    }

    //constructor has radius parameter

    Cylinder(double r)
     {
        super(r);//calling parent class constructor
    }

    //constructor have  radius and height paramters

    Cylinder(double r, double h) 
    {
        super(r);//calling parent class constructor
        height = h;
    }

    //constructor have radius, height, color parameters

    Cylinder(double r, double h, String c)
    {
        super(r, c);//calling parent class constructor
        height = h;
    }

    //getter to retrive the height  value 

    public double getHeight() 
    {
        return height;
    }

    //setter to set the height value 

    public void setHeight(double val) 
    {
        height = val;
    }

    //caluculate area for cylinder by  overriding  the super class method

    public double getArea() {
        return (2 * 3.14 * getRadius() * height) + (2 * 3.14 * getRadius() * getRadius());
    }

    //calculate volume for cylinder

    public double getVolume()
    {
        return getArea() * height;     
    }
}

public class Inheritence9
{
    public static void main(String[] args)
    
    {
        //object creation for super class

        Circlee circleObj = new Circlee();                           
        System.out.println("circle values:");
        circleObj.setRadius(1.0); //calling method in  super class                                      
        System.out.println("Radius :" +circleObj.getRadius());
        circleObj.setColor("Red");
        System.out.println("Color :" +circleObj.getColor());
        System.out.println("Area :"  +circleObj.getArea());
        System.out.println();

        //object creation child class cylinder

        Cylinder cylinderObj = new Cylinder();                       
        System.out.println("Cylinder values");
        cylinderObj.setHeight(1.0); //calling  methods for child class
        cylinderObj.setColor("Pink");
        System.out.println("Height :" +cylinderObj.getHeight());
        cylinderObj.setRadius(1.0);
        System.out.println("Radius :" +cylinderObj.getRadius());
        System.out.println("Color:" +cylinderObj.getColor());
        System.out.println("Area : "+cylinderObj.getArea());
        System.out.println("Volume :" +cylinderObj.getVolume());


    }
}

    
