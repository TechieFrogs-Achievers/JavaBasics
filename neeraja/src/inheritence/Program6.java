package inheritence;

//parent class for classes rectangle and circle
class Shape
{
    //method for shape class
    public void shape()
    {
        System.out.println("This is shape");
    }
}
//subclass for shape class
class Rectangle1 extends Shape
{
    //method to print recctangle shape 
    public void rectangleShape()
    {
        System.out.println("This is rectangle shape");
    }
}

//another subclass for shape parent class
class Circle extends Shape
{
    //method to print circle shape
    public void circleShape()
    {
        System.out.println("This is circle shape");
    }
}

//sub class for rectangle class
class Square1 extends Rectangle1
{
    public void squareShape()
    {
        System.out.println("Square is a rectangle");
    }
}


public class Program6
{
    public static void main(String[] args)
     {
         //creating object for square class
        Square1 Obj = new Square1();          
        Obj.shape();            //calling shape class's method
        Obj.rectangleShape();  //calling rectangle class's method
    }
    
}
