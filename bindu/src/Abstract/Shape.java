package Abstract;

abstract class Shape 
{
    //creating the abstract methods with the parameters 
 abstract void RectangleArea(int l,int b);
 abstract void SquareArea(int side);
 abstract void CircleArea(int radius);   
}
class Area extends Shape     //subclass inherits the parent class
{
    void RectangleArea(int l, int b)   
    {
        System.out.println(l*b);     //area of rectange length*breadth & print 
    }
    void SquareArea(int s)
    {
        System.out.println(s*s);   //area of square side*side
    }
    void CircleArea(int r)
    {
        System.out.println(3.14*r*r);   //area of circle pi*r*r
    }

public static void main(String[] args) 
{
    Shape s =new Area();   //upcasting 
    s.RectangleArea(4,5);    //calling the methods 
    s.SquareArea(8);
    s.CircleArea(7);
}

}
