 class Shape 
{   // create method for shape 
    void demo1()
    {
        System.out.println("This is shape");
    }

} 
//child class for shape 
class Rectangles extends Shape
{   // create method for rectangle 
    void demo2 ()
    {
        System.out.println("This is rectangle shape");
    }

}
//child class for shape
class Circle extends Shape
{   // create method for circle
    void demo3()
    {
        System.out.println("This is circle  shape ");
    }
}
// child class for rectangle
class Squaree extends Rectangles
{   // method for square
    void demo4() 
    {
        System.out.println("Square is a Rectangle");
    }
}
public class Inheritance6
{
    public static void main(String[] args) 
    {
        Shape s = new Shape();
        s.demo1();
        Squaree s1 = new Squaree();//create object for square
        s1.demo4();// calling square method with object

        
    

        
    }
}
