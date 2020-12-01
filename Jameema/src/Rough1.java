

interface RegularPolygonn //interface
{
    static int TotalSides(int a) //static method
    {
        return a;
    }
    abstract int getNumSide(); //abstract method
}
class EquilateralTrianglee implements RegularPolygonn //implementing the interface
{
    
    @Override
    public int getNumSide() //accessor method
     {
        return 3; //returns a value
    }

}
class Squareee implements RegularPolygonn //implementing the interface
{

    @Override
    public int getNumSide() 
    {
        return 4; //returns a value
    }
}
    
 public class Rough1 implements RegularPolygonn
{
    public int getNumSide() 
    {
        return 4; //returns a value
    }

   public static void main(String[] args) 
   {
    EquilateralTrianglee e = new EquilateralTrianglee(); //creating object
    System.out.println("num of sides in equilateraltriangle  :"+e.getNumSide());
    Squareee s = new Squareee();  //creating object
    System.out.println("num of sides in square  :"+s.getNumSide());
    int a = e.getNumSide()+s.getNumSide(); //adding all the sides
    //System.out.println("the sum of the sides of all elements  :"+a);
    System.out.println("the sum of the sides of all elements  :" + RegularPolygonn.TotalSides(a)); //printing ststicmethod

       
   }
    
}
