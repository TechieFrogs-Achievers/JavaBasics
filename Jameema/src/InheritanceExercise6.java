class Shape
{
    void Display() //method for shape
    {
        System.out.println("this is shape");
    }

}
class Rectanglee extends Shape
{
    public void Display() // method for rectangle
    {
        System.out.println("this shape is square");

    }

}
class Circle extends Shape
{
    public void Display1() //method for circle
    {
        System.out.println("this shape is circle");
    }

}
class Squaree extends Rectanglee
{
    public void Display() //method for square
    {
        System.out.println("square is rectangel");
    }

}
public class InheritanceExercise6 
{
    public static void main(String[] args)
     {
         Shape s = new Shape(); //creating object 
         s.Display(); //calling method using object
         Squaree s1 = new Squaree(); //creating object 
         s1.Display(); //calling methoc

        
    }
    
}
