package Interface;

interface RegularPolygon1c 
{
    abstract int getNumsides();  //creating abstract datamembers
    abstract int getsidelength();
    int getPerimeter();
    double getInteriorAngle();
}
class EquilateralTriangle1  implements RegularPolygon1c   //subclass inherits the parentclass
{
    int side;  //instance members
    int length;
    @Override
    public int getNumsides()     
    {
        return side;
    }
    public int getsidelength()
    {
        return length;
    }
    public int getPerimeter()
    {
        return side*length;   //return the Perimeter
    }
    public double getInteriorAngle()
    {
        return (((side-2)*3.14)/side);  //returns the interior angle
    }
}
class Square2 implements RegularPolygon1c   //subclass2 inherits the parentclass
{
    int side;   //instance members
    int length;
    @Override   //overrides the methods
    public int getNumsides()
    {
    return side;
    }
public int getsidelength()
{
    return length;
}
public int getPerimeter()
{
    return side*length;
}
public double getInteriorAngle()
{
    return(((side-2)*3.14)/side);
}
public static void main(String[] args) {
    EquilateralTriangle1 e = new EquilateralTriangle1();   //creating the objects  for subclass
    e.side=6;
    e.length=8;  //calling the instance members
    System.out.println("the equilateralTriangle of side is:"+e.getNumsides());  //prints the values of the methods
    System.out.println("the equilateralTriangle of length is:"+e.getsidelength());
    System.out.println("the equilateralTriangle of side is:"+e.getPerimeter());
    System.out.println("the equilateralTriangle of lengthis:"+e.getInteriorAngle());
    Square2 s = new Square2();     //creating objects for the subclass
    s.side =7;
    e.length =9;  //calling the intance members with object
    System.out.println("the square of side is:"+e.getNumsides());
    System.out.println("the square of side is:"+e.getsidelength());
    System.out.println("the square of side is:"+e.getPerimeter());   //displays the results of subclass methods
    System.out.println("the square of side is:"+e.getInteriorAngle());
}
}
