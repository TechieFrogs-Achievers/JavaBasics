package Interface;
interface RegularPolygon//interface
{
    abstract int getNumSides();//abstarct method
   abstract int getSideLength();//abstarct mehod
   
}
class EquilateralTriangle implements RegularPolygon
{
    int side;
    public EquilateralTriangle(int s)//constructor for sides
    {
        side = s;
    }
    public int getNumSides()//abstract method implementation
    {
        return 3;
    }
    public int getSideLength()//abstract method implementation
    {
       return side;
    }
}//subclass implements the interface
    class Square implements RegularPolygon
    {
        int side;
        public Square(int s1)//another constructor for sides
        {
           side = s1;
        }
        public int getNumSides()//abstract method implementation
        {
           return 4;
        }
        public int getSideLength()//abstract method implementation
        {
            return side;
        }
    }
public class InterfaceExample1
 {
    public static void main(String[] args) 
    {
        RegularPolygon r = new EquilateralTriangle(7);//creating object for equilateral triangle
        System.out.println("the number of sides of an equitorial Triangle is"+r.getNumSides());//printing the number of sides with ref object
        System.out.println(" the side length of an equitorial Triangle is "+r.getSideLength());//printing the side length with ref object
        RegularPolygon obj = new Square(5);//creating object for square
        System.out.println("the number sides  of a Square "+obj.getNumSides());//printing the number of sides with ref object
        System.out.println("the side length of a Square"+obj.getSideLength());//printing the side length with ref object

    }

	public void calculation() {
	}
}
