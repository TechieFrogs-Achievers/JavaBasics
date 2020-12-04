public class InterfaceExcercise1 
{
   public static void main(String[] args) 
   {
      EquilateralTriangle et=new EquilateralTriangle(25, 8.2, 5.5);//object created
      System.out.println("get number of sides:"+et.getNumSides()); //calling getnumofsides method 
      System.out.println("get side length:"+et.getSideLength());//calling getsidelength method 

       SquareBox sb=new SquareBox(52, 23, 56, 58); //assign valuees  
       System.out.println("get number of sides:"+sb.getNumSides()); //calling getnumofsides method 
      System.out.println("get side length:"+sb.getSideLength());//calling getsidelength method 
      int a = et.getNumSides()+sb.getNumSides(); //adding all the sides
      System.out.println("the sum of the sides of all elements  :" + RegularPolygon.TotalSides(a)); //printing ststic method

   } 
}
//interface class
interface  RegularPolygon 
{
    abstract int getNumSides();//abstract method for numofsides
    abstract double getSideLength();//abstract method for length of side
    static int TotalSides(int a) //static method
    {
        return a;
    }
}
class EquilateralTriangle implements RegularPolygon//equilateraltriangle implements the interface class
{
    private static final int numberOfSides=3;
     private double side1,side2,side3;
     EquilateralTriangle(double side1,double side2,double side3)//constructor
     {
         this.side1=side1;
         this.side2=side2;
         this.side3=side3;
     }
      public int getNumSides()//implement the abstract method
      {
         return numberOfSides;
      }
      public double getSideLength()//implement the abstract method
      {
          return side1+side2+side3;
      }

}
class SquareBox implements RegularPolygon//sqaurebox implements the interface class
{
    private static final int numberOfSides=4;
    private double side1,side2,side3,side4;
     SquareBox(double side1, double side2,double side3,double side4)//constructor
     {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.side4=side4;
     }
     public int getNumSides()//implement the abstract method
     {
        return numberOfSides;  
     }
     public double getSideLength()//implement the abstract method
     {
        return side1+side2+side3+side4;
     }
}