package Abstract;
abstract class Shape1 //abstract class
{
    abstract void RectangleArea(int length , int breadth); //abstract method with parameters
    abstract void SquareArea(int side);
    abstract void CircleArea(float radius);
}
class Area1 extends Shape1 //inherts the asbtract class details
{
    void RectangleArea(int length, int breadth) //parameterised method
    {
        System.out.println("area of rectangle :" +(length*breadth));
    }
    void SquareArea(int side)
    {
        System.out.println("area of square :" +(side*side));
    }
    void CircleArea(float radius)
    {
        System.out.println("area of circle :" +(Math.PI*radius*radius));
    }
}
public class AbstractExercise6
 {
     public static void main(String[] args)
      {
          Shape1 s = new Area1(); //upcasting
          s.RectangleArea(5, 4); //calling method and passing values
          s.SquareArea(4);
          s.CircleArea(6);
         
     }
    
}
