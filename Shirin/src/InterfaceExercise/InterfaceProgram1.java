package InterfaceExercise;
//interface class
interface RegularPolygon
{    
    // declaring abstarct methods
     abstract int getNumsides();
     abstract int getSidelength();

}
// sub class 1
class EquilateralTriangle implements RegularPolygon// implements the parent class
{
    int side;// instance variable
    EquilateralTriangle(int s)// constructor
    {
        side = s;

    }
    public int getNumsides()
    {
        return(3);
    }
    public int getSidelength()
    { 
        return (side);

    } 
}
//sub class 2
class Square implements RegularPolygon
{  
    int side;
    Square(int s)// constructor for class
    {
        side =s;
    }
    @Override
    public int getNumsides() 
    {
        return(4);
    }
    public int getSidelength()
    {
        return (side);
    }


}
// main class
public class InterfaceProgram1 
{    public static void main(String[] args)
    {
        EquilateralTriangle e = new EquilateralTriangle(8);// creating object for subclass 1
        // calling methods with object
        System.out.println("The equilateralTriangle of side is :"+e.getNumsides());
        System.out.println("The equilateralTraingle of length is :" +e.getSidelength());
        Square s = new Square(6);// creating object for subclass 2
        // calling methods
        System.out.println(" The square of side is :" +s.getNumsides());
        System.out.println("The square of length is :"+s.getSidelength());

    
        
    }
    
}
