package InheritanceDoc;
 
class Shape //parent class
{
    public void shapeDisplay()//method to display shape
    {
        System.out.println("This is Shape");
    }
} 
class Rectangle1 extends Shape //inherits properties of parent class
{
    public void rectangleShape() //method 
    {
        System.out.println("This is Rectangle shape ");
    }
} 
class Circle extends Shape//inherits prperties of parent class
{
    public void circleShape()//method to dispaly shape of circle
    {
        System.out.println("This is circle shape");
    }
} 
class Square1 extends Rectangle1//class square extends propertirs of rectangle class
{
    public void shape()//method
    {
        System.out.println("Square is a rectangle");
    }
}

public class Program6 
{
    public static void main(String[] args) 
    {

         Square1 sq = new Square1(); //object of square class
         sq.shapeDisplay();
         sq.rectangleShape();
         sq.shape();
    }
}
