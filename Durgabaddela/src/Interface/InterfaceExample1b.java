package Interface;
interface RegularPolygonn//interface
{  
    static  int totalSides( int Num_of_sides)
    {
        return Num_of_sides;
    }
    abstract int getNumSides();
    
}
class EquilateralTrianglee implements RegularPolygonn
{
    public int getNumSides()
    {
        return 3;
    }
}
    class Squaree implements RegularPolygonn
    {
        public int getNumSides()
        {
           return 4;
        }
    }
public class InterfaceExample1b
 {
     static int totalSides(int t_sides)
     {
        return t_sides;
     }
    public static void main(String[] args) 
    {
        EquilateralTrianglee r = new EquilateralTrianglee();
        System.out.println("the number of sides"+r.getNumSides());
        
        Squaree obj = new Squaree();
        System.out.println("the square number of side"+obj.getNumSides());
        int t_sides = r.getNumSides()+obj.getNumSides();
        System.out.println(t_sides);
    
    }
}

