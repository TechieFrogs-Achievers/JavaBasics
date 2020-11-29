public class AbstractExcercise6 
{
    public static void main(String[] args) 
    {
      //Shapes s=new Areax();//object creation
      Areax s=new Areax();
      s.rectangleArea(5, 5); //assign values
      s.squareArea(6);//assign values
      s.circleArea(3);//assign values
    }
}
abstract class Shapes//parent class
{
   abstract  void rectangleArea(int length,int breadth);//abstract method for area of rectangle
   abstract void squareArea(int side);//abstract method for area of square
   abstract void circleArea(double radius);//abstract method for area of circle
}
class Areax extends Shapes
{
    void rectangleArea(int length,int breadth)//implement abstract method for area of rectangle
    {
       int area=length*breadth;
       System.out.println("Area of a Rectangle  is="+area);
    }
    void squareArea(int side)//implement abstract method for area of rectangle
    {
       int area=side*side;
       System.out.println("Area of a square ="+area);
    }
    void circleArea(double radius)//implement abstract method for area of rectangle
    {
        double area=(3.14)*(radius*radius);
        System.out.println("Area of circle="+area);
    }
}