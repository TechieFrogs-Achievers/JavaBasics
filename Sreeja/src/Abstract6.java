//abstract class

abstract class Shapes
{
    //abstract methods

    abstract void RectangleArea(int length,int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);
}

//subclass of abstract class

class Area1 extends Shapes
{
    
    //implementation of abstract methods
    
    void RectangleArea(int length,int breadth)      //method to print rectanglearea
    {
        System.out.println("Rectanglearea = "+length*breadth);
    }

    void SquareArea(int side)           //method to print square area
    {
        System.out.println("Squarerea = "+side*side);
    }

    void CircleArea(int radius)         //method to print circe area
    {
        System.out.println("Circlearea = "+3.14*radius*radius);
    }
}


public class Abstract6
 {
     public static void main(String[] args) 
     {
        Area1 a = new Area1();                 //object creation for subclass
       
       //methods calling with object
       
        a.RectangleArea(5,7);
        a.SquareArea(7);
        a.CircleArea(5);

    }
    
}
