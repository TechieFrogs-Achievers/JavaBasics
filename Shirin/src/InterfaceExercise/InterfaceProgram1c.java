package InterfaceExercise;
// interface class
interface RegularPolygon2
{    
    // declaring abstarct methods
     abstract int getNumsides();
     abstract int getSidelength();
     int getPerimeter();
     double  getInteriorAngle();

}
// sub class 1
class EquilateralTriangle2 implements RegularPolygon2// implements the parent class
{
    int side;// instance variable
    int length;
    @Override
    public int getNumsides()
    {   
        return side;
    }
    public int getSidelength()
    { 
        return length;

    } 
    public int getPerimeter()
    {
        return side*length;
    }
    public double getInteriorAngle()
    {
        return (((side-2)*3.14)/side);
    }
}
//sub class 2
class Square2 implements RegularPolygon2
{  
    int side;
    int length;
    @Override
    public int getNumsides()//Accessor method 
    {   
        return side;// returning side
    }
    public int getSidelength()
    {
        return length; // returning length
    }
    public int getPerimeter()
    {
        return side*length;
    }
    public double getInteriorAngle()
    {
        return (((side-2)*3.14)/side);
    }
}
// main class
public class InterfaceProgram1c
{

        public static void main(String[] args)
        {
            EquilateralTriangle2 e = new EquilateralTriangle2();// creating object for subclass 1
            e.side = 3;// Assigning value for side
            e.length = 5;// Assigning value for length
            // calling methods with object
            System.out.println("The equilateralTriangle of side is :"+e.getNumsides());
            System.out.println("The equilateralTraingle of length is :" +e.getSidelength());
            System.out.println("The equilateralTriangle of side is :"+e.getPerimeter());//15
            System.out.println("The equilateralTraingle of length is :" +e.getInteriorAngle());//1.046
            Square2 s = new Square2();// creating object for subclass 2
            s.side = 4;
            s.length = 8;
            // calling methods
            System.out.println(" The square of side is :" +s.getNumsides());
            System.out.println("The square of length is :"+s.getSidelength());
            System.out.println("The square of perimeter  is :"+s.getPerimeter());//32
            System.out.println("The square of interiorangle is :" +s.getInteriorAngle());//1.57
    
        
        }
    
}
