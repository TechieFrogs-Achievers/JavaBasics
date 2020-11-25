class Circle1  // parent class of circle1
{
    double radius; // datamembers
    String color;
    Circle1(double r,String c) // constructors
    {
       radius=r;
       color=c;
    }
    Circle1(double r)
    {
        radius=r;
    }
    Circle1()
    {

    } 
    public double getRadius() // accessors methods and mutators methods
    {
        return radius;
    }
    public void setRadius(double r)
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
        //System.out.println("Color:"+color);
    }
    public double getArea()
    {
        return radius*radius*3.14;
    }
}
class Cylinder extends Circle1 // child class as Cylinder
{
    private double height;
    Cylinder() // constructors
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
    public double getHeight() // accessor and mutators methods
    {
        return height;
    }
    void setHeight(double h)
    {
        height=h;
        //System.out.println("Height:"+height);
    }
    
    public double getVolume()
    {
    return getArea()*height;    
    }
}
class Inheritance11 // main class
{
    public static void main(String[] args) {
        Circle1 c=new Circle1(); // obj creation for parent class
        c.setRadius(2.0);
        System.out.println("Radius:"+c.getRadius());
        c.setColor("red");
        System.out.println("Color:"+c.getColor());
        System.out.println("Area:"+c.getArea());


        Cylinder cy=new Cylinder(); //method calling for child class
        cy.setHeight(4.5);
        cy.setColor("black");
        System.out.println("Height:"+cy.getHeight());
        cy.setRadius(6.0);
        System.out.println("Radius:"+cy.getRadius());
        System.out.println("Color:"+cy.getColor());
        System.out.println("Area:"+cy.getArea());
        System.out.println("Volume"+cy.getVolume());

    }
}
