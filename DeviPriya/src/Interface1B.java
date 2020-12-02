//package Interface;

interface RegularPolygonn //interface
{
    static int TotalSides(int a) //static method
    {
        return a;
    }
    abstract int getNumSide();    //abstract method
    abstract int getSideLength(); //abstract method 

}
class EquilateralTriangle1 implements RegularPolygonn //implementing the interface
{
    int side; //datamember
    EquilateralTriangle1(int s) //parameterised constructor
    {
        side=s;

    }

public int getNumSide() //accessor method
     {
        return 3; //returns a value
    }
public int getSideLength()  //accessor method
    {
        return side;
    }


}
class Square1 implements RegularPolygonn //implementing the interface
{
    int side;
    Square1(int s) //parameterised constructor
    {
        side=s;
    }

    public int getNumSide() 
    {
        return 4; //returns a value
    }
    public int getSideLength() //accessor method
    {
        return side;
    }



}


public class Interface1B
 {
     public static void main(String[] args)
      {
        EquilateralTriangle1 e = new EquilateralTriangle1(); //creating object
        System.out.println("num of sides in equilateraltriangle  :"+e.getNumSide());
        System.out.println("length of side in equilateraltriangle  :"+e.getSideLength());
        Square1 s = new Square1();  //creating object
        System.out.println("num of sides in square  :"+s.getNumSide());
        System.out.println("length of side in equilateraltriangle  :"+s.getSideLength());
        int a = e.getNumSide()+s.getNumSide(); //adding all the sides
        System.out.println("the sum of the sides of all elements  :" + RegularPolygonn.TotalSides(a)); //printing ststic method

     }

}
