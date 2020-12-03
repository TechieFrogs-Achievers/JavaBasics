package AbstractionExamples;
abstract class Shape //abstract class
{ 
    //abstract methods
    
    abstract void rectangleArea(int l ,int b);
    abstract void squareArea(int side);
    abstract void circleArea(int radius);
} 

class Area extends Shape
{
    void rectangleArea(int l, int b) //implementation of abstract method
    {
        System.out.println("Area of rectangle is : " +(l*b));
    } 

    void squareArea( int side )
    {
        System.out.println("Area of Square is : " +(side*side));//implementation of abstract method
    }

    void circleArea(int radius)
    {
        System.out.println("Area of Circle is : " +(Math.PI *radius *radius));//implementation of abstract method
    }
}
public class Program6 
{
    public static void main(String[] args) 
    {  
        //object creation 
         Area a = new Area(); 
         //method call
         a.rectangleArea(4, 5);
         a.squareArea(6);
         a.circleArea(7);
    }
    
}
