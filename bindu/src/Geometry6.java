class Shape
{
    void Display() //creating method for parent class
    {
        System.out.println("this is a Shape:");
    }
}
class Rectangle2 extends Shape //rectangle inherits shape
{
    void Display() 
    {
        System.out.println("this is a Rectangle:");
    }
}
class Circle extends Shape //circle inherits shape
{
    void Display()
    {
        System.out.println("this is a Circle:");
    }
}
class Square1 extends Rectangle2 //square inherits rectangle class
{
    void Show() //create method
    {
        System.out.println("square is a Rectangle:");
    }
}
class Geometry6 //main class calling the objects 
{
    public static void main(String[] args)
     {
        Square1 s = new Square1(); //creating object for class square
        s.Display(); 
        s.Show();
    }
}







