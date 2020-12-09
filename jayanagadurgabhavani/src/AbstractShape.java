abstract class Shape
{
    abstract void RectangleArea(int length, int breath);
    abstract void SquareArea(int side);
    abstract void CricleArea(int radius);
}
class Area1 extends Shape
{
    void RectangleArea(int length,int breath)
    {
        int RectangleArea=length*breath;
        System.out.println(RectangleArea);
    }
    void SquareArea( int side ) //method overloading 
    {
        int SquareArea=side*side;
        System.out.println(SquareArea);
    }
    void CircleArea(int radius)
    {
        double CircleArea=(3.14*radius*radius);
        System.out.println(CircleArea);
    }
}
public class AbstractShape
{
    public static void main(String[] args) 
    {
        Area1 a=new Area1(); //object class 
        a.RectangleArea(66,28); //calling method passing arguments of int type
        a.SquareArea(52);//calling method  passing arguments of int type
        a.CircleArea(4); 
    }
}