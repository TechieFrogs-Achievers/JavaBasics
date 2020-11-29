//creating interface

interface RegularPolygon
{
    //abstract methods

    int getNumSides();
    int getSideLength();

    
}

//implementation of interface

class EquilateralTriangle implements RegularPolygon
{
   int length;      //instance variable

    public int getNumSides()    //implementation of abstract method
    {
        return 3;
    }

    public EquilateralTriangle(int l)       //constructor
    {
        length = l;
    }

    public int getSideLength()      //implementation of abstract method
    {
        return length;
    } 


}

class Square1 implements RegularPolygon
{
    int length;

    public Square1(int l)       //constructor
    {
        length = l;
    }

   //implementation of abstract methods
   
    public int getNumSides()
    {
        return 4;
    }

    public int getSideLength()
    {
        return length;
    }
}

public class Interface1
 {
     public static void main(String[] args) 
     {
        EquilateralTriangle et = new EquilateralTriangle(7);        //object creation

        //methods calling
        
        System.out.println(et.getNumSides());   
        System.out.println(et.getSideLength());

        Square1 sc = new Square1(6);        //object creation

        //methods calling
        
        System.out.println(sc.getNumSides());
        System.out.println(sc.getSideLength());
        
    }
}
