package Interface;

//import sun.jvm.hotspot.tools.SysPropsDumper;

//interface class
interface RegularPolygon
{
    //abstract methods
    int getNumSides();
    double getSideLength();
}
//normal class
class EquilateralTriangle implements RegularPolygon
{
    double side;
    //abstract method impementation
    public int getNumSides()
    {
        return 3;
    }
    //constructor
    EquilateralTriangle(double side)
    {
        this.side = side;
    }
    //abstract method implementation
    public double getSideLength()
    {
        return side;
    }
}
//anther class
class Square implements RegularPolygon
{
    double side;
    //abstract method implemenatation
    public int getNumSides()
    {
        return 4;
    }
    //constructor
    Square(double side)
    {
        this.side = side;
    }
    //another abstract method implementation
    public double getSideLength()
    {
        return side;
    }
}

public class Example1 
{
    public static void main(String[] args) {
        RegularPolygon r = new EquilateralTriangle(5);              //child class object creation
        //EquilateralTriangle e = new EquilateralTriangle(5);
        System.out.println("The equilateral triangle sides " +r.getNumSides());             //methods calling
        System.out.println("The equilateral triangle side length is " +r.getSideLength());
        Square s = new Square(6);                                       //another class object creation
        System.out.println("The equilateral triangle sides " +s.getNumSides());             //methods calling
        System.out.println("The equilateral triangle side length is " +s.getSideLength());     
    }
    
}
