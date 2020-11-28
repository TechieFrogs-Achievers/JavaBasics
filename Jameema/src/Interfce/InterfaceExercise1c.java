package Interfce;
interface RegularPolygon1 //interface
{
    
    abstract int getNumSide(); //abstract method
    abstract int getSideLength();
    double getPerimeter();
    double getInteriorAngle();
}
class EquilateralTriangle1 implements RegularPolygon1 //implementing the interface
{
    int side , num; //datamember
    @Override
    public int getNumSide() //accessor method
     {
        return num; //returns a value
    }
    @Override
    public int getSideLength()  //accessor method
    {
        return side;
    }
    @Override
    public double getPerimeter()
     {
        
        return num*side;
    }
    @Override
    public double getInteriorAngle() 
    {
        return  (((num-2)*3.14)/num);
    }
    

}
class Squaree1 implements RegularPolygon1 //implementing the interface
{
    int side , num;

    @Override
    public int getNumSide() 
    {
        return num; //returns a value
    }
    @Override
    public int getSideLength() //accessor method
    {
        return side;
    }
    @Override
    public double getPerimeter() 
    {
        return num*side;
    }
    @Override
    public double getInteriorAngle()
     {
        return (((num-2)*3.14)/num) ;
    }

}


public class InterfaceExercise1c 
{
    public static void main(String[] args)
    {
        EquilateralTriangle1 e = new EquilateralTriangle1(); //creating object
        e.side=5;
        e.num=3;
        System.out.println("num of sides in equilateraltriangle  :"+e.getNumSide()); //calling accessormethod by using object
        System.out.println("length of side in equilateraltriangle  :"+e.getSideLength());
        System.out.println("the perimeter of equilateraltriangle  :" +e.getPerimeter());
        System.out.println("the interiorAngle in equilateraltriangle  :" +e.getInteriorAngle());
        Squaree1 s = new Squaree1();  //creating object
        s.side=6;
        s.num=4;
        System.out.println("num of sides in square  :"+s.getNumSide());
        System.out.println("length of side in square  :"+s.getSideLength()); //calling accessormethod by using object
        System.out.println("the perimeter of square  :" +s.getPerimeter());
        System.out.println("the interiorAngle  in square:" +s.getInteriorAngle());
        
    }
    
}
