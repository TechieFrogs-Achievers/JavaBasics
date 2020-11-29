abstract class Area//abstract class
{
    public Area()
    {
     // System.out.println("im default constructor");
    }
    abstract void areaDisplay();//abstract method
}
//child class

class Rectangle extends Area
{
  int length;
  int breadth;
  public Rectangle(int l, int b)//constructor
  {
      length = l;
      breadth = b;
  }
  void areaDisplay()//override
  {
       System.out.println("area is"+(length*breadth));
      
  }
}
 public class AbstractWithConstructor
 {
     public static void main(String[] args)
     {
    Rectangle a = new Rectangle(5,8);//creating obj for child class
    a.areaDisplay();//method call
     }
}
