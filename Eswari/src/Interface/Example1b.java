package Interface;
//interface for regularpolygon
interface RegularPolygon1
{
    //abstract methods
    int getNumSides();
    //static method
    static double totalSides(double sum)
    {
        
        return sum;
    }
    
}
//normal class
class EquilateralTriangle1 implements RegularPolygon1
{
    double side;
    //abstract method impementation
    public int getNumSides()
    {
        return 3;
    }
    
}
//anther class
class Square1 implements RegularPolygon1
{
    double side;
    //abstract method implemenatation
    public int getNumSides()
    {
        return 4;
    }
    
}

public class Example1b 
{
    //static method
    static double totalSides(double sum)
    {
        
        return sum;
    }
    public static void main(String[] args) {
        RegularPolygon1 r = new EquilateralTriangle1();              //child class object creation
        //EquilateralTriangle e = new EquilateralTriangle(5);
        System.out.println("The equilateral triangle sides " +r.getNumSides());             //methods calling
        
        Square1 s = new Square1();                                       //another class object creation
        System.out.println("The equilateral triangle sides " +s.getNumSides());             //methods calling
        double sum = r.getNumSides() + s.getNumSides();
        System.out.println("The sides sum is " +Example1b.totalSides(sum));             //static method calling 
    }
    
}
