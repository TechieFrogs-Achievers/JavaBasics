package InterfaceExercise;
//interface class
interface RegularPolygon1
{    
      static int totalSides(int value)// static method
     {
         return value;
     }

}
// sub class 1
class EquilateralTriangle1 implements RegularPolygon1// implements the parent class
{
    
    public int getNumsides()//reurn side of euilateraltriangle
    {
        return(3);
    }
 
}
//sub class 2
class Square1 implements RegularPolygon1
{  
    public int getNumsides()//reurn side of square 
    {
        return(4);
    }
}
// main class
public class InterfaceceProgram1b
{    
    // again intiallizing method in main class
     static int totalSides(int value)
     {
         return  value;
     }
     
    public static void main(String[] args) 
    {
        EquilateralTriangle1 e = new EquilateralTriangle1();// creating object for subclass 1
        // calling methods with object
        System.out.println("The equilateralTriangle of side is :"+e.getNumsides());
        Square1 s = new Square1();// creating object for subclass 2
        // calling methods
        System.out.println(" The square of side is :" +s.getNumsides());
        int value = e.getNumsides()+s.getNumsides();
        System.out.println(value);
      
    
       
        
    }
    
}
