abstract class Shape // abstract class 
{
    abstract void RectangleArea(int Length,int breath); //abstract method 
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);
}
class Area1 extends Shape //parent class inherits abstract class
{
   //int Length,breath,radius,side;
    void RectangleArea(int Length,int breadth) //method for parent class 
    {
        int a=Length*breadth;  
        System.out.println(a);
    }
    void SquareArea( int side ) //method overloading 
    {
        int s1=side*side;
        System.out.println(s1);
    }
    void CircleArea(int radius)
    {
        double c=(3.14*radius*radius);
        System.out.println(c);
    }
}
public class AbstractMath
 {
    public static void main(String[] args) 
    {

        Area1 a=new Area1(); //object for parent class 
        a.RectangleArea(10,10); //calling method from parent class by object  and passing arguments of int type
        a.SquareArea(5);//calling method from parent class by object  and passing arguments of int type
        a.CircleArea(2); //calling method from parent class by object  and passing arguments of int type
    }
 }
