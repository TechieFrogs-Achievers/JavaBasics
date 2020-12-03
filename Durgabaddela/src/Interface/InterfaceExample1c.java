package Interface;
interface RegularPolygon2//interface
{
    abstract int getNumSides();//abstarct method
   abstract int getSideLength();//abstarct mehod
   int getPerimeter();
   double getInteriorAngle();
   
}
class EquilateralTriangle1 implements RegularPolygon2
{
    int side;
    int length;
    
    public int getNumSides()//abstract method implementation
    {
        return side;
    }
    public int getSideLength()//abstract method implementation
    {
       return length;
    }
    public int getPerimeter()
    {
        return side*length;
    }
    public double getInteriorAngle()
    {
        return ((side-2)*3.14)/4;
    }
}//subclass implements the interface
    class Square1 implements RegularPolygon2
    {
        int side;
    int length;
    
    public int getNumSides()//abstract method implementation
    {
        return side;
    }
    public int getSideLength()//abstract method implementation
    {
       return length;
    }
    public int getPerimeter()//overide perimeter method
    {
        return side*length;
    }
    public double getInteriorAngle()//override interior method
    {
        return ((side-2)*3.14)/4;
    }
}
public class InterfaceExample1c
 {
    public static void main(String[] args) 
    {
        EquilateralTriangle1 e = new EquilateralTriangle1();//creating object for equilateral triangle
        e.side = 3;//assign the values by using object reference
        e.length = 5;//assign the value by object ref
        System.out.println("the number of sides of an equitorial Triangle is"+e.getNumSides());//printing the number of sides with ref object
        System.out.println(" the side length of an equitorial Triangle is "+e.getSideLength());//printing the side length with ref object
        System.out.println("the perimeter of an equilateral traingle is  "+e.getPerimeter());
        System.out.println("the interiorAngle of an equilateral traingle is  "+e.getInteriorAngle());
        Square1 obj = new Square1();//creating object for square
        obj.side = 6;//assign the value by using object reference
        obj.length = 5;//assign the value by using object reference
        System.out.println("the number sides  of a Square "+obj.getNumSides());//printing the number of sides with ref object
        System.out.println("the side length of a Square"+obj.getSideLength());//printing the side length with ref object
        System.out.println("the perimeter of a square is  "+obj.getPerimeter());
        System.out.println("the interiorAngle of a square  is  "+obj.getInteriorAngle());
        

    }
}

