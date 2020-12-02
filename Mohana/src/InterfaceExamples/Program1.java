package InterfaceExamples;

interface RegularPloygon //interface
{  
    //abstract methods
    
    int getNumSides();
    int getSideLength();
} 
class EquilateralTriangle implements RegularPloygon 
{    
    int s1 = 3 ,len;
    public EquilateralTriangle(int l) //constructor having 1 parameter 
    {
      this.len = l;
    }
   public int getNumSides() //implementation of abstract method
   {
       return s1;
   }  

   public int getSideLength()//implementation of abstract method
   {
       return  len;
   }
}
class Square implements RegularPloygon
{
    int length , s2 = 4; 
    public Square(int length) //constructor having 1 parameter 
    {
       this.length=length;
    }
    public int getNumSides()//implementation of abstract method
    {
        return s2;
    } 
    public int getSideLength()//implementation of abstract method
    {
        return length;


    }
}

public class Program1 
{
    public static void main(String[] args) 
    {
        EquilateralTriangle eq = new EquilateralTriangle(5);
        System.out.println(" Equilaterial triangle has sides : "+ eq.getNumSides());
        System.out.println(" Equilaterial triangle has length : "+ eq.getSideLength());
        
        Square sc = new Square(6);
        System.out.println("Square has length: "+sc.getSideLength());
        System.out.println("Square has sides : "+sc.getNumSides());

    }
    
}
