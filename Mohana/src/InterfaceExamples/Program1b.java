package InterfaceExamples;

interface Regularpolygon1 //interface 
{
    static int totalSides(int n) //static method to calculate total no of sides
    {
        return n;
    }
}
class  EquilateralTriangle1b implements Regularpolygon1 //implemnted class
{
      public int getNumSides(int sides )//method to get no of sudes
      {
            return sides;
      }
}   

class Square1b implements Regularpolygon1
{
    public int getNumsides(int sides)//method to get no of sides
    {
        return sides;
    }
}
public class Program1b 
{
    public static void main(String[] args) 
    {   
        //object creation
        System.out.println("!!!!Equilateral triangle!!!");

        EquilateralTriangle1b eq = new EquilateralTriangle1b();
        System.out.println("sides in Equilateral triangle :  " +eq.getNumSides(3) );
        

        System.out.println("*****Square*****");
      
        Square1b sq = new Square1b();
        System.out.println("Sides in Square  : " +  sq.getNumsides(4) );
      

        System.out.println("-------Regular polygon----------");

      int n =  eq.getNumSides(3)+sq.getNumsides(4) ;
      System.out.println("total no of sides : " + Regularpolygon1.totalSides(n));     
        
    }
    
}
