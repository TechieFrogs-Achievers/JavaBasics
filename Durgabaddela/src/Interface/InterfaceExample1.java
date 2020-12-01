package Interface;
interface RegularPolygon//interface
{
    abstract int getNumSides();
   abstract int getSideLength();
}
class EquilateralTriangle implements RegularPolygon
{
    int side;
    public EquilateralTriangle(int s)
    {
        side = s;
    }
    public int getNumSides()
    {
        return 3;
    }
    public int getSideLength()
    {
       return side;
    }
}
    class Square implements RegularPolygon
    {
        int side;
        public Square(int s1)
        {
           side = s1;
        }
        public int getNumSides()
        {
           return 4;
        }
        public int getSideLength()
        {
            return side;
        }
    }
public class InterfaceExample1
 {
    public static void main(String[] args) 
    {
        RegularPolygon r = new EquilateralTriangle(7);
        System.out.println("the number of sides"+r.getNumSides());
        System.out.println(" the side length "+r.getSideLength());
        RegularPolygon obj = new Square(5);
        System.out.println("the square number of side"+obj.getNumSides());
        System.out.println("the side length"+obj.getSideLength());
    }
}
