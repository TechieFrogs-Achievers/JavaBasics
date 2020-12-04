class Shape 
{
    void prints()
    {
        System.out.println("This is  a shape");
    }   
}
class Rectangle1 extends Shape
{
    void printr()
    {
        System.out.println("This is a Rectanglar shape");
    }
}
class Circle extends Shape
{
    void printc()
    {
        System.out.println("This is in Circular Shape");
    }
}
class Square extends Rectangle1
{
    void printsq()
    {
        System.out.println("Square is Rectangle");
    }
}
class Inheritance5
{
    public static void main(String[] args)
    {
        Shape s = new Shape ();
        Rectangle1 r = new Rectangle1();
        Circle c = new Circle();
        Square sq = new Square ();
        sq.prints();
        sq.printr();
    }
}
