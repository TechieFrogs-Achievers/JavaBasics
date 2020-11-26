// using inheritance written the shapes 

class Shape 
{
    void getDisplay() // display method for shape parent class
    {
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape
{
    void show() // show method for subclass rectangle
    {
        System.out.println("This is Rectangluar shape ");
    }

}
class Circle extends Shape
{
    void getShow()// getshow method for circle
    {
        System.out.println("This is Circular shape");
    }
}
class Square1 extends Rectangle
{
    void display() // subclass method for Square1 subclass
    {
        System.out.println("Square is a rectangle");
    }
}
class Inheritance6
{
    public static void main(String[] args)
    {
      Square1 s=new Square1(); // obj creating for Square1 class
      s. getDisplay(); // calling display method for square1 class
      s.show(); // calling show method for square1 class
    }
}
