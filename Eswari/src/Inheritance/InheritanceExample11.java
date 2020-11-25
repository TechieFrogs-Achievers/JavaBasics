//package Inheritance;

//super class
class Circle1
{
    protected double radius;
    private String color;

    Circle1() {

    }

    // radius constructor
    Circle1(double r) {
        radius = r;
    }

    // radius and color constructor
    Circle1(double r, String c) {
        radius = r;
        color = c;
    }
    //getting values using method
    public double getRadius() {
        return radius;
    }
    //set value for private variable
    public void setRadius(double value) {
        radius = value;
    }
    //getting value from set method
    public String getColor() {
        return color;
    }

    //set value for private variable
    public void setColor(String val) {
        color = val;
    }

    //caluculate area for circle
    public double getArea() {
        return radius * radius * 3.14;
    }

}

// sub class
class Cylinder extends Circle1 {
    private double height;

    //default constructor
    Cylinder() {

    }

    //constructor for radius
    Cylinder(double r) {
        super.setRadius(r);
    }

    //constructor for radius and height
    Cylinder(double r, double h) {
        super(r);
        height = h;
    }

    //constructor for radius, height, color
    Cylinder(double r, double h, String c) {
        super(r, c);
        // super(val);
        height = h;
    }

    //getting value from set method
    public double getHeight() {
        return height;
    }

    //setting value for private variable
    public void setHeight(double val) {
        height = val;
    }

    //caluculate area for cylinder and override the super class method
    public double getArea() {
        return (2 * 3.14 * getRadius() * height) + (2 * getRadius() * getRadius());
    }

    //calculate volume for cylinder
    public double getVolume()
    {
        return getArea() * height;              // pi * r * r * h
    }
}

public class InheritanceExample11 
{
    public static void main(String[] args) {
        Circle1 circleObject = new Circle1();                           //object creation for super class
        System.out.println("-------Circle values-----------");
        circleObject.setRadius(1.0);                                       //calling methods for super class
        System.out.println("Radius :" +circleObject.getRadius());
        circleObject.setColor("Red");
        System.out.println("Color :" +circleObject.getColor());
        System.out.println("Area :"  +circleObject.getArea());
        System.out.println();
        Cylinder cylinderObject = new Cylinder();                       //object creation child class cylinder
        System.out.println("-------Cylinder values-----------");
        cylinderObject.setHeight(8.0);                                     //calling  methods for child class
        cylinderObject.setColor("Green");
        System.out.println("Height :" +cylinderObject.getHeight());
        cylinderObject.setRadius(1.0);
        System.out.println("Radius :" +cylinderObject.getRadius());
        System.out.println("Color:" +cylinderObject.getColor());
        System.out.println("Area : "+cylinderObject.getArea());
        System.out.println("Volume :" +cylinderObject.getVolume());


    }
    
}
