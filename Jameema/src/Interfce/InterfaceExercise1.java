package Interfce;
interface RegularPolygon //interface
{
    
    abstract int getNumSide(); //abstract method
    abstract int getSideLength();
}
class EquilateralTriangle implements RegularPolygon //implementing the interface
{
    int side; //datamember
    EquilateralTriangle(int s) //parameterised constructor
    {
        side=s;

    }
    @Override
    public int getNumSide() //accessor method
     {
        return 3; //returns a value
    }
    @Override
    public int getSideLength()  //accessor method
    {
        return side;
    }

}
class Squaree implements RegularPolygon //implementing the interface
{
    int side;
    Squaree(int s) //parameterised constructor
    {
        side=s;
    }

    @Override
    public int getNumSide() 
    {
        return 4; //returns a value
    }
    @Override
    public int getSideLength() //accessor method
    {
        return side;
    }

}

public class InterfaceExercise1
 {
    public static void main(String[] args) 
    {
        EquilateralTriangle e = new EquilateralTriangle(5); //creating object
        System.out.println("num of sides in equilateraltriangle  :"+e.getNumSide()); //calling accessormethod by using object
        System.out.println("length of side in equilateraltriangle  :"+e.getSideLength());
        Squaree s = new Squaree(6);  //creating object
        System.out.println("num of sides in square  :"+s.getNumSide());
        System.out.println("length of side in square  :"+s.getSideLength()); //calling accessormethod by using object

        
    }
     
    
}
