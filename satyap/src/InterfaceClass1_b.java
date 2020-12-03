interface RegularPolygon1 // interface 
{
    abstract int getNumSides(); // abstract method for interface
    static int totalSides(int a) //static method for interface
    {
       return a;
    }
}
     
class EquilateralTriangle1 implements RegularPolygon1 // extending class for interface
{
   public int getNumSides() // abstract methods
   {
     return 3;
   }
   int side; // instance var
   EquilateralTriangle1(int s) // constructor
   {
     side=s;
   }
   
}
class Square4 implements RegularPolygon1 // Subclass implementing interface
{
    public int getNumSides()// abstract methods
    {
        return 4;
    }
    int side; // instance var
    Square4(int s)// constructor
    {
      side=s;
    }
    
}
public class InterfaceClass1_b // driver class
{
    public static void main(String[] args) {
        EquilateralTriangle1 et=new EquilateralTriangle1(10); // obj creation for child class
        System.out.println(et.getNumSides());// method call for getNumSides
        Square4 s=new Square4(30);// obj creation for square class
        System.out.println(s.getNumSides()); // method call for getNumSides 
       int a=et.getNumSides()+s.getNumSides(); //sum of sides of the elements
      System.out.println(a);
      System.out.println(RegularPolygon1.totalSides(a)); // calling static method
      
    }
}

    

