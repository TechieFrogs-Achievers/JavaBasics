package Interface;
interface RegularPolygonn//interface
{  
    static  int totalSides( int Num_of_sides)//static method
    {
        return Num_of_sides;
    }
    abstract int getNumSides();
    
}
class EquilateralTrianglee implements RegularPolygonn
{
    public int getNumSides()//method implementation 
    {
        return 3;
    }
}
    class Squaree implements RegularPolygonn
    {
        public int getNumSides()//methodimplementation for abstract method
        {
           return 4;
        }
    }
public class InterfaceExample1b
 {
     static int totalSides(int t_sides)//static method
     {
        return t_sides;
     }
    public static void main(String[] args) 
    {
        EquilateralTrianglee r = new EquilateralTrianglee();//creating the object for eqilateral class
        System.out.println("the number of sides"+r.getNumSides());//printing equilateral sides
        
        Squaree obj = new Squaree();//creating the object for square class 
        System.out.println("the square number of side"+obj.getNumSides());
        int t_sides = r.getNumSides()+obj.getNumSides();//adding toatl sides
        System.out.println(t_sides);
    
    }
}

