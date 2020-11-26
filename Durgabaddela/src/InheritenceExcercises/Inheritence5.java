package InheritenceExcercises;

// parent shape class

class Shape
{
    //method for shape class

    public void shape()
    {
        System.out.println("This is shape");
    }
}
//subclass inherits the shape class

class Rectanglee extends Shape
{
    //method for printing rectangle shape 

    public void rectangleShape()
    {
        System.out.println("This is rectangle shape");
    }
}

// subclass  inherits shape  class
class Circle extends Shape
{
    //method for printing  circle shape

    public void circleShape()
    {
        System.out.println("This is circle shape");
    }
}

//sub class for rectangle class

class Squaree extends Rectanglee
{
    //method for SquareResctangle
    public void squareShape()
    {
        System.out.println("Square is a rectangle");
    }
}

public class Inheritence5 
{
    public static void main(String[] args)
    {
        //creating object for square class

        Squaree s = new Squaree();
        s.rectangleShape();//calling  rectangleShape method
        s.shape();//calling shape class method
    }
    
}
