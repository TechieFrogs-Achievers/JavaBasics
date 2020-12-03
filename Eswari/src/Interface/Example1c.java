package Interface;

//interface class
interface RegularPolygon2
{
    //abstract methods
    int getNumSides(int side);
    double getSideLength();
    double getPerimeter();
    double getInteriorAngle();
}
//normal class
class EquilateralTriangle2 implements RegularPolygon2
{
    double side,length;
    //abstract method impementation
    public int getNumSides(int side)
    {
        return side;
    }
    //constructor
    EquilateralTriangle2(double side)
    {
        this.side = side;
    }
    //abstract method implementation
    public double getSideLength()
    {
        return length;
    }
    void setLength(double length)
    {
        this.length = length;
    }

    public double getPerimeter()
    {
        return (side * length);
    }
    //abstract method implementation
    public double getInteriorAngle()
    {
        return ((side - 2)* Math.PI) / side;
    }
}
//anther class
class Square2 implements RegularPolygon
{
    double side,length;
    //abstract method implemenatation
    public int getNumSides()
    {
        return 4;
    }
    //constructor
    Square2(double side)
    {
        this.side = side;
    }
    //another abstract method implementation
    public double getSideLength()
    {
        return side;
    }
    void setLength(double length)
    {
        this.length = length;
    }
    //abstract method implementation
    public double getPerimeter()
    {
        return (side * length);
    }
    //abstract method implementation
    public double getInteriorAngle()
    {
        return ((side - 2)* Math.PI) / side;
    }
}


public class Example1c 
{
    public static void main(String[] args) {
        EquilateralTriangle2 e = new EquilateralTriangle2(3);
        e.setLength(2.1);
        System.out.println("Length is " +e.getSideLength());
        System.out.println("Perimeter is " +e.getPerimeter());
        System.out.println("Interior angle is " +e.getInteriorAngle());
        System.out.println("------Square details---------");
        Square2 s = new Square2(4);
        s.setLength(6.3);
        System.out.println("Length is " +s.getSideLength());
        System.out.println("Perimeter is " +s.getSideLength());
        System.out.println("Interior angle is " +s.getInteriorAngle());
    }
    
}
